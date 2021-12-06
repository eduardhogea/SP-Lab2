import java.util.ArrayList;
import java.util.List;


public class Section implements Element {
    private String title;
    private ArrayList<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<Element>();
    }

    @Override
    public void print() {
        System.out.println(String.format( title));

        this.elements.forEach(Element::print);
    }

    @Override
    public void add(Element element) {
        this.elements.add(element);
    }

    @Override
    public void remove(Element element) {
        this.elements.remove(element);
    }

    @Override
    public Element get(int index) {
        return this.elements.get(index);
    }


}