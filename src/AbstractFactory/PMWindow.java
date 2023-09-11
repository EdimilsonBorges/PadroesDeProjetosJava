package AbstractFactory;

/**
 * Esta classe executa o método draw, métodos que são implementado da Interface Window
 */
public class PMWindow implements Window{
    @Override
    public void draw() {
        System.out.println("Desenhou PM Window - Abstract Fatory");
    }
}
