package AbstractFactory;

/**
 * Esta classe Cria e retorna um PMScrollBar e um PMWindow, métodos que são implementado da Interface WidgetFactory
 */
public class PMWidgetFactory implements WidgetFactory{
    @Override
    public ScrollBar createScrollBar() {
        return new PMScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PMWindow();
    }
}
