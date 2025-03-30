import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request-handler")
public class RequestHandlerServlet extends HttpServlet {

    // Handles GET requests
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve query parameters from URL
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Retrieve client request details
        String clientIP = request.getRemoteAddr();
        String userAgent = request.getHeader("User-Agent");

        // Generate response
        out.println("<html><head><title>GET Request Info</title></head><body>");
        out.println("<h2>GET Request Received</h2>");
        out.println("<p><strong>Name:</strong> " + (name != null ? name : "Not provided") + "</p>");
        out.println("<p><strong>Email:</strong> " + (email != null ? email : "Not provided") + "</p>");
        out.println("<p><strong>Client IP:</strong> " + clientIP + "</p>");
        out.println("<p><strong>User-Agent:</strong> " + userAgent + "</p>");
        out.println("</body></html>");
    }

    // Handles POST requests
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve form data from POST request
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Generate response
        out.println("<html><head><title>POST Request Info</title></head><body>");
        out.println("<h2>POST Request Received</h2>");
        out.println("<p><strong>Name:</strong> " + (name != null ? name : "Not provided") + "</p>");
        out.println("<p><strong>Email:</strong> " + (email != null ? email : "Not provided") + "</p>");
        out.println("</body></html>");
    }
}
