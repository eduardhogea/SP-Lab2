public class Table implements Element {
    private final String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table with title: " + this.title);
    }

    @Override
    public void add(Element element) {


    }

    @Override
    public void remove(Element element) {


    }


}