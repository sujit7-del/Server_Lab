@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        HttpSession session = request.getSession(false);
        String user = (session != null) ? (String) session.getAttribute("user") : null;

        if (user != null) {
            response.getWriter().println("<h2>Welcome, " + user + "!</h2>");
        } else {
            response.sendRedirect("login.html");
        }
    }
}
