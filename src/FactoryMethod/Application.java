package FactoryMethod;

public abstract class Application {

    public abstract Document createDocument(); // recebe uma instância do documento a ser executado

    /**
     * Executa os métodos do documento instanciado
     */
    public void newDocument(){
        createDocument().open();
        createDocument().close();
        createDocument().save();
        createDocument().revert();
    }
}
