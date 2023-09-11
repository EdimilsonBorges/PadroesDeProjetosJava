package Singleton;

public class Singleton {


    private static Singleton instance; // Armazena a instância

    /**
     * Contrutor sempre privado para não ser instanciado nenuma vez em outra classe.
     */
    private Singleton(){

    }

    /**
     * Cria uma instância ou retorna uma instância que já foi criada
     * @return retorna a instância
     */
    public static Singleton getInstance(){
        if(instance == null){ // se a instância for = a null
            instance = new Singleton(); // cria uma instância
        }
        return instance; // retorna a instância criada
    }

    /**
     * É apenas um método de exemplo
     */
    public void metodoExemplo(){
        System.out.println("Executou o método da classe Singleton - Singleton");
    }
}
