package AbstractFactory;

/**
 * Esta classe executa o método draw, métodos que são implementado da Interface Window
 */
public class MotifWindow implements Window{
    @Override
    public void draw() {
        System.out.println("Desenhou Motif Window - Abstract Fatory");
    }
}
