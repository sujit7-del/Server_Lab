package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/app-info")
public class AppInfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve global parameters from ServletContext
        ServletContext context = getServletContext();
        String appName = context.getInitParameter("appName");
        String supportEmail = context.getInitParameter("supportEmail");

        out.println("<html><head><title>Application Info</title></head><body>");
        out.println("<h2>Application-Wide Information</h2>");
        out.println("<p><strong>Application Name:</strong> " + appName + "</p>");
        out.println("<p><strong>Support Email:</strong> " + supportEmail + "</p>");
        out.println("</body></html>");
    }
}
