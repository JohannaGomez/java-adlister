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


        // redirect if the user is not an admin
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");

        if (!("administrator".equals(session.getAttribute("user")))){
            response.sendRedirect("/login");
//            session.removeAttribute("user"); -- I don't need this lines for now (20 and 21) .. this is for a log out
//            session.invalidate();
            return;
        }
        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);


    }
}
