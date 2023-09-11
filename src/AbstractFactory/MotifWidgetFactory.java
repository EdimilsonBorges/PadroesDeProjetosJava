package AbstractFactory;

/**
 * Esta classe Cria e retorna um MotifScrollBar e um MotifWindow, métodos que são implementado da Interface WidgetFactory
 */
public class MotifWidgetFactory implements WidgetFactory{
    @Override
    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }

    @Override
    public Window createWindow() {
        return new MotifWindow();
    }
}
