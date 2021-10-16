public class Author {
    private final String author_name;

    public Author(String author_name) {
        this.author_name = author_name;
    }

    public void print() {
        System.out.println(this.author_name);
    }
}