import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@RequestScoped
@Named("reqNews")
public class NewsManaged {
    @Inject
    private NewsService newsService;

    public List<News> getAllNews(){
        return newsService.findAll();
    }
}
