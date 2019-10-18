import javax.ejb.*;
import java.util.List;

@Stateless
//@TransactionManagement(TransactionManagementType.CONTAINER)
class NewsService {
    //@TransactionAttribute(TransactionAttributeType.REQUIRED)
    public List<News> findAll() {
        return List.of(
                new News("Nachricht 1", "Nachrichtentext"),
                new News("Nachricht 2", "Nachrichtentext 2")
        );
    }
}