package Command;

import java.util.HashMap;
import java.util.Map;

public class Invoker {

    private static Map<String, Command> comandos = new HashMap<>(); // Cria um mapa de comandos

    static {
        comandos.put("A", new ACommand()); // Adiciona o comando A com a instancia do comando a ser executado
        comandos.put("B", new BCommand()); // Adiciona o comando B com a instancia do comando a ser executado
    }

    /**
     * Este método serve para chamar e executar os comandos desejado
     * @param command  recebe o comando desejado
     */
    public static void invoke(String command){
        if(comandos.containsKey(command)){ // verifica se o comando existe na lista
            comandos.get(command).execute(); // se existir exucuta
        }else {
        System.out.println("Este Comando não existe - Command"); //se não existir, avisa que não existe
        }
    }
}
