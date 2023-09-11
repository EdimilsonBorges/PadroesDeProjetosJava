package AbstractFactory;

public class IDE {

    private Window window;
    private ScrollBar scrollBar;

    /**
     * Construtor da classe IDE
     * @param widgetFactory recebe uma nova classe que carrega o layout desejado
     */

    public IDE(WidgetFactory widgetFactory){

        setLayout(widgetFactory);

    }

    /**
     * Esse método serve para adicionar um layout
     * @param widgetFactory recebe uma nova classe que carrega o layout desejado
     */
    public void setLayout(WidgetFactory widgetFactory){
        window = widgetFactory.createWindow();
        scrollBar = widgetFactory.createScrollBar();
        drawApp();
    }

    /**
     * Esse método serve para chamar os métodos de desenhos das classes implementadas
     */
    public void drawApp(){
        window.draw();
        scrollBar.draw();
    }
}
