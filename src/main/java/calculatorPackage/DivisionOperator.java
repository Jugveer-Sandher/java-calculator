package calculatorPackage;

/**
 * The DivisionOperator that implements Operator and its methods
 * @author Jugveer Sandher
 */
public class DivisionOperator implements Operator{

    /**
     * Calculate(final int operand1, final int operand2) is an Override method from the Operator interface the divides two numbers
     * @param final int operand1 first command line argument
     * @param final int operand2 third command line argument
     * @return operand1 dividing operand2
     */
    @Override
    public int calculate(final int operand1, final int operand2) {
        return operand1 / operand2;
    }
}
