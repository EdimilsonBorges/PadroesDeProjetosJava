package Flyweight;

public class CharacterFlyweight implements Flyweight{
    private char c;
    private static int contadorInstancias = 0;
    static String nome = "";

     CharacterFlyweight(char c){
        this.c = c;
        contadorInstancias++;
    }
    @Override
    public void print(String format) {
         nome = nome+c+format;
    }

    public static void getInstancias(){
        System.out.println(nome + " (Flyweight)");
        System.out.println("Número de Instâncias = "+contadorInstancias+ " - Flyweight");
    }

}
