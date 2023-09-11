package Proxy;

public class ImageProxy implements Graphic{

    Image image;

    public ImageProxy(Image image){
        this.image = image;
    }
    @Override
    public void draw() {
        System.out.println("Proxy executou para Draw - Proxy");
        image.draw();
    }

    @Override
    public void getExtent() {
        System.out.println("Proxy executou para getExtent - Proxy");
        image.getExtent();

    }
}
