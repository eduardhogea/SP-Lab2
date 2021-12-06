import java.util.ArrayList;
import java.util.List;

public class Book extends  Section{
    private final String title;
    private final ArrayList<Chapter> chapterList = new ArrayList<Chapter>();
    private Author author;
    private List<Author> authors;
    public Book(String title) {
        this.title = title; 
        authors = new ArrayList<Author>();
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public void print() {
        System.out.println(this.title);
    }
}