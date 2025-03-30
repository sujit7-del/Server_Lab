package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/config")
public class ConfigServlet extends HttpServlet {
    private String dbURL;
    private String dbUser;
    private String dbPassword;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        // Read initialization parameters from web.xml
        dbURL = config.getInitParameter("dbURL");
        dbUser = config.getInitParameter("dbUser");
        dbPassword = config.getInitParameter("dbPassword");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>ServletConfig Example</title></head><body>");
        out.println("<h2>Database Configuration</h2>");
        out.println("<p><strong>DB URL:</strong> " + dbURL + "</p>");
        out.println("<p><strong>DB User:</strong> " + dbUser + "</p>");
        out.println("<p><strong>DB Password:</strong> " + dbPassword + "</p>");
        out.println("</body></html>");
    }
}
