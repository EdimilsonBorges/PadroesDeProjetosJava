package FactoryMethod;

/**
 * Essa classe serve para instanciar o documento do excel e retorna essa instância criada
 */
public class ExcelApplication extends Application{
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
