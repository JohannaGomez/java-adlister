
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowFirstAdServlet", urlPatterns = "/show-first-ad")

public class ShowFirstAdServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Ads adDao = DaoFactory.getAdsDao();
        Ad theFirstAd = adDao.all().get(0);

        System.out.println("--------------------------");
        System.out.println("Id# " + theFirstAd.getId());
        System.out.println("Title: " + theFirstAd.getTitle());
        System.out.println("Description: " + theFirstAd.getDescription());

        response.getWriter().println("ok, this is the first ad");
    }

}
