package com.r13a.mcp.sendemail;

import java.util.List;

import io.helidon.extensions.mcp.server.Mcp;
import io.helidon.extensions.mcp.server.McpException;
import io.helidon.extensions.mcp.server.McpPromptContent;
import io.helidon.extensions.mcp.server.McpPromptContents;
import io.helidon.extensions.mcp.server.McpRole;
import io.helidon.extensions.mcp.server.McpToolContent;
import io.helidon.extensions.mcp.server.McpToolContents;

@Mcp.Version("0.1")
@Mcp.Server("mcp-send-email")
class McpServer {

    /**
     * Simple tool to send an email.
     * @param from From email address
     * @param to To email addresses
     * @param subject Email subject
     * @param body Email body
     * @return Informative message that the email was sent
     */
    @Mcp.Tool("Sends an email.")
    List<McpToolContent> sendEmail(
            @Mcp.Description("From email address") String from,
            @Mcp.Description("To email addresses") String to,
            @Mcp.Description("Email subject") String subject,
            @Mcp.Description("Email body") String body
        ) 
    {

        if (from.isEmpty() || to.isEmpty() || subject.isEmpty() || body.isEmpty()) {
            throw new McpException("Missing required arguments from, to, subject or body");
        }

        System.out.println("\nSending to: " + to);
        System.out.println("Sending from: " + from);
        System.out.println("Sending subject: " + subject);
        System.out.println("Sending email: " + body);

        return List.of(McpToolContents.textContent("Message sent!"));
    }

    /**
     * MCP Prompt to send an email given from and to email addresses, subject, and content (body)
     * @param from From email address
     * @param to To email addresses
     * @param subject Email subject
     * @param body Email body
     * @return Prompt content
     */
    @Mcp.Prompt("Prompt to send an email given from and to email addresses, subject, and content (body)")
    List<McpPromptContent> sendEmailPrompt(@Mcp.Description("From email address") String from,
            @Mcp.Description("To email addresses") String to,
            @Mcp.Description("Email subject") String subject,
            @Mcp.Description("Email body") String body) {

        return List.of(McpPromptContents.textContent(
                """
                    Send email to %s from %s with subject '%s' and body: %s
                """.formatted(to, from, subject, body), McpRole.USER));
    }
}
