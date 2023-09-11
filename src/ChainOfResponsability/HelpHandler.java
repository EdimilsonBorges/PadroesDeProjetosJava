package ChainOfResponsability;

public abstract class HelpHandler {

    HelpHandler helpHandler;

    public HelpHandler(HelpHandler helpHandler){
        this.helpHandler = helpHandler;
    }

    public void handlerHelp(){
        if(this.helpHandler != null){
            System.out.println("Repassou chamada do help - Chain Of Responsability");
            this.helpHandler.handlerHelp();
        }else {
            System.out.println("Não foi possível tratar o evento de help - Chain Of Responsability");
        }

    }
}
