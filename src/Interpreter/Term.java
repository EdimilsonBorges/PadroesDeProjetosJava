package Interpreter;

public class Term implements AbstractExpression{

    private AbstractExpression term;
    private AbstractExpression constante;

    public Term(AbstractExpression constante) {
        this.constante = constante;
    }

    public Term(AbstractExpression term, AbstractExpression constante) {
        this.term = term;
        this.constante = constante;
    }

    @Override
    public int interpret() {

        if(term == null){
         return constante.interpret();
        }else {
            return constante.interpret() * term.interpret();
        }
    }
}
