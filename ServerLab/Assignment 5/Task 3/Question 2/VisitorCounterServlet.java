package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visitor-counter")
public class VisitorCounterServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        // Initialize visitor count if not set
        ServletContext context = getServletContext();
        if (context.getAttribute("visitorCount") == null) {
            context.setAttribute("visitorCount", 0);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ServletContext context = getServletContext();
        int visitorCount = (int) context.getAttribute("visitorCount");
        visitorCount++; // Increment visitor count
        context.setAttribute("visitorCount", visitorCount); // Store updated count

        out.println("<html><head><title>Visitor Counter</title></head><body>");
        out.println("<h2>Visitor Counter</h2>");
        out.println("<p><strong>Total Visitors:</strong> " + visitorCount + "</p>");
        out.println("</body></html>");
    }
}
