package calculatorPackage;

/**
 * The MultiplicationOperator that implements Operator and its methods
 * @author Jugveer Sandher
 */
public class MultiplicationOperator implements Operator{

    /**
     * Calculate(final int operand1, final int operand2) is an Override method from the Operator interface the multiplies two numbers
     * @param final int operand1 first command line argument
     * @param final int operand2 third command line argument
     * @return operand1 multiplying operand2
     */
    @Override
    public int calculate(final int operand1, final int operand2) {
        return operand1 * operand2;
    }
}
