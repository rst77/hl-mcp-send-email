# MCP Send Email - Helidon MCP Server Example

## Description

This is an example **MCP (Model Context Protocol) Server** project built with the [Helidon](https://helidon.io/) framework.

The project implements a basic MCP server that provides a simple tool for simulating email sending, demonstrating how to create MCP servers using Java and Helidon.

## Purpose

This project is part of a series of examples with **increasing complexity** developed for studying **Java in conjunction with LLM (Large Language Models)**. The goal is to provide a practical foundation for understanding how to build MCP servers that can be used by AI agents and LLM-based assistants.

## Technologies

- **Java** (JDK 17+)
- **Helidon 4.3.1** (Helidon SE)
- **MCP (Model Context Protocol)**
- **Maven** (dependency management and build)

## Project Structure

The project contains:

- **McpServer.java**: MCP server implementation with:
  - `sendEmail`: Tool for simulated email sending
  - `sendEmailPrompt`: Example prompt for LLM interaction
  
- **Main.java**: Main class that initializes the server

## Features

### Tool: Send Email

Tool that simulates sending an email with the following parameters:
- `from`: Sender's email address
- `to`: Recipient's email address(es)
- `subject`: Email subject
- `body`: Email body

### Prompt: Send Email Prompt

Example prompt demonstrating how to structure an email sending request for use by an LLM.

## How to Run

### Prerequisites

- Java JDK 17 or higher
- Maven 3.8+

### Build

```bash
mvn clean package
```

### Run

```bash
mvn exec:java -Dexec.mainClass="com.r13a.mcp.sendemail.Main"
```

Or run the generated JAR:

```bash
java -jar target/mcp-send-email.jar
```

The server will start on port **8080** (configurable in `application.yaml`).

## Configuration

Server configuration can be adjusted in the `src/main/resources/application.yaml` file:

```yaml
server:
  port: 8080
  host: 0.0.0.0
```

## Next Steps

This is the initial project in the series. Subsequent projects will include:

- Integration with real email sending APIs
- Authentication and authorization
- Data persistence
- More complex MCP tools
- Integration with multiple services

## Resources

- [Helidon Documentation](https://helidon.io/docs/latest/)
- [Model Context Protocol](https://modelcontextprotocol.io/)
- [MCP Specification](https://spec.modelcontextprotocol.io/)

## License

This is a sample project for educational purposes.

## Author

Developed as part of a series of studies on Java and LLM.
