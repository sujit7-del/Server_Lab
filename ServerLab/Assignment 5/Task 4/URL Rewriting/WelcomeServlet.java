@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve session
        HttpSession session = request.getSession(false);
        String user = (session != null) ? (String) session.getAttribute("user") : "Guest";

        out.println("<h2>Welcome, " + user + "!</h2>");
    }
}
