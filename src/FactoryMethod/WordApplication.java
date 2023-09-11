package FactoryMethod;

/**
 * Essa classe serve para instanciar o documento do Word e retorna essa instância criada
 */
public class WordApplication extends Application{
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
