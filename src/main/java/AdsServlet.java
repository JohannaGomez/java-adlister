
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdsServlet", urlPatterns = "/ads")



//<%--Create a file ads/index.jsp. This file will show a listing of all the ads on your site.--%>
//<%--This page should be available when a user visits /ads.--%>
//<%--Use the all method on the AdsDao class to get a listing of all the ads, and pass this on to your jsp file--%>
//<%--In your jsp file, loop through all the ads and display each one.--%>

public class AdsServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
        List<Ad> ads = DaoFactory.getAdsDao().all();
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/index.jsp")
                .forward(request, response);
    }

}
