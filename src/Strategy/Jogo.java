package Strategy;

public class Jogo {

    private Strategy strategy;

    public Jogo(){
        this.strategy = new FacilStrategy();
    }

    public void jogar(){
        strategy.jogar();
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
}
