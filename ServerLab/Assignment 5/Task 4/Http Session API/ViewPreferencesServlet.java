@WebServlet("/view-preferences")
public class ViewPreferencesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve session
        HttpSession session = request.getSession(false);
        String theme = (session != null) ? (String) session.getAttribute("theme") : "Default";
        String language = (session != null) ? (String) session.getAttribute("language") : "English";

        out.println("<h2>Current Preferences</h2>");
        out.println("<p><strong>Theme:</strong> " + theme + "</p>");
        out.println("<p><strong>Language:</strong> " + language + "</p>");
    }
}

