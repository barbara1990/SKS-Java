import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "newsservlet")
public class NewsServlet extends HttpServlet {
    @Inject
    private NewsService newsService;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        StringBuilder html = new StringBuilder("" +
                "<!DOCTYPE html>" +
                "<html>" +
                "<body>" +
                "<h1>News</h1>");

        newsService.findAll().forEach(news -> html.append("<h2>" + news.getTitle() + "</h2>" +
                "<p>" + news.getText() + "</p>"));

        html.append("</body>" +
                "</html>");

        out.write(html.toString());
    }
}