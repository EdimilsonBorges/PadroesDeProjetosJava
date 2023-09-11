package Bridge;

public class XWindowImp implements WindowImp{
    @Override
    public void devDrawText() {
        System.out.println("Desenhou devDrawText XWindowImp - Bridge");
    }

    @Override
    public void devDrawLine() {
        System.out.println("Desenhou devDrawLine XWindowImp - Bridge");
    }
}
