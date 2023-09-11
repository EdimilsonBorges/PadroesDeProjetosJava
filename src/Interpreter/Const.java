package Interpreter;

public class Const implements AbstractExpression{
    private int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
