@WebServlet("/url-session")
public class UrlSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Create session
        HttpSession session = request.getSession();
        session.setAttribute("user", "JohnDoe");

        // Generate URL with encoded session ID
        String url = response.encodeURL("welcome");

        out.println("<h2>Session Created!</h2>");
        out.println("<a href='" + url + "'>Go to Welcome Page</a>");
    }
}

