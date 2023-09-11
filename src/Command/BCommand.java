package Command;

/**
 * Essa classe contém todas as funções do Comando B
 */
public class BCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Executou o Comando B - Command");
    }
}
