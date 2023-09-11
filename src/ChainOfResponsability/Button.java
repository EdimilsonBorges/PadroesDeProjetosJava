package ChainOfResponsability;

public class Button extends HelpHandler{

    private boolean ativo;

    public Button(HelpHandler helpHandler, boolean ativo) {
        super(helpHandler);
        this.ativo = ativo;
    }

    @Override
    public void handlerHelp() {
        if(ativo){
            System.out.println("Tratou o help no botão - Chain Of Responsability");
        }else {
            super.handlerHelp();
        }
    }
}
