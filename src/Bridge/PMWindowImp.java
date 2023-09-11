package Bridge;

public class PMWindowImp implements WindowImp{
    @Override
    public void devDrawText() {
        System.out.println("Desenhou devDrawText PMWindowImp - Bridge");
    }

    @Override
    public void devDrawLine() {
        System.out.println("Desenhou devDrawLine PMWindowImp - Bridge");
    }
}
