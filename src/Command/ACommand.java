package Command;

/**
 * Essa classe contém todas as funções do Comando A
 */
public class ACommand implements Command {
    @Override
    public void execute() {
        System.out.println("Executou o Comando A - Command");
    }
}
