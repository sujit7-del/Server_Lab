import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request-info")
public class RequestInfoServlet extends HttpServlet {
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
        String requestMethod = request.getMethod();
        String requestURI = request.getRequestURI();
        String protocol = request.getProtocol();

        // Generate response
        out.println("<html><head><title>Request Info</title></head><body>");
        out.println("<h2>Retrieved Query Parameters</h2>");
        out.println("<p><strong>Name:</strong> " + (name != null ? name : "Not provided") + "</p>");
        out.println("<p><strong>Email:</strong> " + (email != null ? email : "Not provided") + "</p>");

        out.println("<h2>Client Request Details</h2>");
        out.println("<p><strong>IP Address:</strong> " + clientIP + "</p>");
        out.println("<p><strong>User-Agent:</strong> " + userAgent + "</p>");
        out.println("<p><strong>Request Method:</strong> " + requestMethod + "</p>");
        out.println("<p><strong>Request URI:</strong> " + requestURI + "</p>");
        out.println("<p><strong>Protocol:</strong> " + protocol + "</p>");

        out.println("</body></html>");
    }
}
