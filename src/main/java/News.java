import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {
    private Long id;
    private String title;
    private String text;

    public News(String title, String text) {
        this(null, title, text);
        //this.title = title;
        //this.text = text;
    }
}