package CompositeDesignPattern.Calculator;

public class Number implements ArithmeticExpressionInterface  {

    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
