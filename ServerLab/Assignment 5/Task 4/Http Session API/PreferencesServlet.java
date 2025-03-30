@WebServlet("/set-preferences")
public class PreferencesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        // Retrieve preferences from form
        String theme = request.getParameter("theme");
        String language = request.getParameter("language");

        // Store in session
        HttpSession session = request.getSession();
        session.setAttribute("theme", theme);
        session.setAttribute("language", language);

        response.getWriter().println("<h2>Preferences Saved!</h2>");
        response.getWriter().println("<a href='view-preferences'>View Preferences</a>");
    }
}
