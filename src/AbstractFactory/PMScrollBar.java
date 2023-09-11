package AbstractFactory;

/**
 * Esta classe executa o método draw, métodos que são implementado da Interface ScrollBar
 */
public class PMScrollBar implements ScrollBar{
    @Override
    public void draw() {
        System.out.println("Desenhou PM Scroll Bar - Abstract Fatory");
    }
}
