import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    private int hitCount;

    public void init(){
        // Reset hit counter.
        hitCount = 0;
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {


//        res.getWriter().println("Hello, world");

        // Set response content type
        res.setContentType("text/html");


        PrintWriter out = res.getWriter();


        String name = req.getParameter("name");

        if (name == null){
            out.println("<h1 align = \"center\">Hello, World!</h1>");
        } else {
            out.println("<h1 align = \"center\">Hello, "+ name + "</h1>");
        }




//        out.println("<input type=\"text\" size=\"20\" name=\"txtUserName\" />");


//      This method executes whenever the servlet is hit
//      increment hitCount

        hitCount++;
        String title = "Total Number visits on this page";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<h1 align = \"center\">" + title + "</h1>\n" +
                "<h2 align = \"center\">" + hitCount + "</h2>\n" +
                "</html>"
      );

    }
}
