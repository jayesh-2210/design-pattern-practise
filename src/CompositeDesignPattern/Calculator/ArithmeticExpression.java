package CompositeDesignPattern.Calculator;

public class ArithmeticExpression implements ArithmeticExpressionInterface  {

    private final ArithmeticExpressionInterface left;
    private final ArithmeticExpressionInterface right;
    private final Operation operation;

    public ArithmeticExpression(ArithmeticExpressionInterface left, ArithmeticExpressionInterface right, Operation operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        switch (operation) {
            case ADD:
                return left.evaluate() + right.evaluate();
            case SUBTRACT:
                return left.evaluate() - right.evaluate();
            case MULTIPLY:
                return left.evaluate() * right.evaluate();
            case DIVIDE:
                return left.evaluate() / right.evaluate();
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
