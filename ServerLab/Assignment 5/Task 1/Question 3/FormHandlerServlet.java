import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {
    @Override 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");

        name = (name != null && !name.trim().isEmpty()) ? name : "Guest";
        email = (email != null && !email.trim().isEmpty()) ? email : "Not provided";

        out.println("<html><head><title>Form Submission</title></head><body>");
        out.println("<h2>Form Submitted Successfully</h2>");
        out.println("<p><strong>Name:</strong> " + (name != null ? name : "Guest") + "</p>");
        out.println("<p><strong>Email:</strong> " + (email != null ? email : "Not provided") + "</p>");
        out.println("</body></html>");
    }
}

