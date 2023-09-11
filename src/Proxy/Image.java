package Proxy;

public class Image implements Graphic {
    @Override
    public void draw() {
        System.out.println("Executou Draw - Proxy");
    }

    @Override
    public void getExtent() {
        System.out.println("Executou getExtent - Proxy");
    }
}
