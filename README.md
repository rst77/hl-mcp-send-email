# MCP Send Email - Helidon MCP Server Example

## Descrição

Este é um projeto de exemplo de **MCP (Model Context Protocol) Server** construído com o framework [Helidon](https://helidon.io/). 

O projeto implementa um servidor MCP básico que fornece uma ferramenta (tool) simples para simulação de envio de emails, demonstrando como criar servidores MCP usando Java e Helidon.

## Objetivo

Este projeto faz parte de uma série de exemplos com **complexidade crescente** desenvolvidos para estudo de **Java associado a LLM (Large Language Models)**. O objetivo é fornecer uma base prática para entender como construir servidores MCP que podem ser utilizados por agentes de IA e assistentes baseados em LLM.

## Tecnologias

- **Java** (JDK 17+)
- **Helidon 4.3.1** (Helidon SE)
- **MCP (Model Context Protocol)**
- **Maven** (gerenciamento de dependências e build)

## Estrutura do Projeto

O projeto contém:

- **McpServer.java**: Implementação do servidor MCP com:
  - `sendEmail`: Tool para envio simulado de emails
  - `sendEmailPrompt`: Prompt exemplo para interação com LLM
  
- **Main.java**: Classe principal que inicializa o servidor

## Funcionalidades

### Tool: Send Email

Ferramenta que simula o envio de um email com os seguintes parâmetros:
- `from`: Endereço de email do remetente
- `to`: Endereço(s) de email do(s) destinatário(s)
- `subject`: Assunto do email
- `body`: Corpo do email

### Prompt: Send Email Prompt

Prompt de exemplo que demonstra como estruturar uma solicitação de envio de email para ser utilizada por um LLM.

## Como Executar

### Pré-requisitos

- Java JDK 17 ou superior
- Maven 3.8+

### Compilar

```bash
mvn clean package
```

### Executar

```bash
mvn exec:java -Dexec.mainClass="com.r13a.mcp.sendemail.Main"
```

Ou executar o JAR gerado:

```bash
java -jar target/mcp-send-email.jar
```

O servidor será iniciado na porta **8080** (configurável em `application.yaml`).

## Configuração

A configuração do servidor pode ser ajustada no arquivo `src/main/resources/application.yaml`:

```yaml
server:
  port: 8080
  host: 0.0.0.0
```

## Próximos Passos

Este é o projeto inicial da série. Projetos subsequentes incluirão:

- Integração com APIs reais de envio de email
- Autenticação e autorização
- Persistência de dados
- Ferramentas MCP mais complexas
- Integração com múltiplos serviços

## Recursos

- [Helidon Documentation](https://helidon.io/docs/latest/)
- [Model Context Protocol](https://modelcontextprotocol.io/)
- [MCP Specification](https://spec.modelcontextprotocol.io/)

## Licença

Este é um projeto de exemplo para fins educacionais.
