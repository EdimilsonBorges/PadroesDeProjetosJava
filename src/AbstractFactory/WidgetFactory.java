package AbstractFactory;

/**
 * Essa Interface para juntar duas Interfece (Interface WindgetFactory) e (Interface WindgetFactory)
 */
 interface WidgetFactory {

     /**
      * Método para criar um ScrollBar (Interface WindgetFactory)
      * @return retorna uma ScrollBar criada
      */
     ScrollBar createScrollBar();

     /**
      * Método para criar um Window (Interface WindgetFactory)
      * @return retorna um Window criado
      */
     Window createWindow();
}
