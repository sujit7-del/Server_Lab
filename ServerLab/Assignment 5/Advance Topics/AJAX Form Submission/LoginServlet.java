@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        ServletContext context = getServletContext();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        JSONObject jsonResponse = new JSONObject();
        
        if (UserDAO.validateUser(username, password, context)) {
            request.getSession().setAttribute("user", username);
            jsonResponse.put("status", "success");
        } else {
            jsonResponse.put("status", "error");
            jsonResponse.put("message", "Invalid credentials");
        }

        response.getWriter().write(jsonResponse.toString());
    }
}
