public class Image implements Element {
    private final String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Image with title: " + this.imageName);
    }
}