import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        HttpSession session = request.getSession();
//        session.removeAttribute("user");
//        session.invalidate();
//        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);


        // redirect if the user is not an admin
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");

        if (!("administrator".equals(session.getAttribute("user")))){
            response.getWriter().println("<h1>" + user +  "please, log in first!</h1>");
            response.sendRedirect("/login");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
    }
}
