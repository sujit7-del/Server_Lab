package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get username from form input
        String username = request.getParameter("username");

        // Create a Cookie to store the username
        Cookie userCookie = new Cookie("username", username);
        userCookie.setMaxAge(60 * 60); // 1 hour expiration
        response.addCookie(userCookie);

        out.println("<h2>Welcome, " + username + "!</h2>");
        out.println("<a href='profile'>Go to Profile</a>");
    }
}
