package CompositeDesignPattern.Calculator;

public class CalculatorMainClass {

    public static void main(String[] args) {

        ArithmeticExpressionInterface one = new Number(1);
        ArithmeticExpressionInterface seven = new Number(7);
        ArithmeticExpressionInterface two = new Number(2);
        ArithmeticExpressionInterface arithmeticExpressionInterface = new ArithmeticExpression(
            one, seven, Operation.MULTIPLY);

        ArithmeticExpressionInterface finalExpression = new ArithmeticExpression(two, arithmeticExpressionInterface,
            Operation.ADD);
        System.out.println(finalExpression.evaluate());
    }

}
