package AbstractFactory;

/**
 * Esta classe executa o método draw, métodos que são implementado da Interface ScrollBar
 */
public class MotifScrollBar implements ScrollBar{
    @Override
    public void draw() {
        System.out.println("Desenhou Motif Scroll Bar - Abstract Fatory");
    }
}
