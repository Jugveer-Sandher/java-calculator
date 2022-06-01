package calculatorPackage;

/**
 * The AdditionOperator implements Operator and it's methods
 * @author Jugveer Sandher
 */
public class AdditionOperator implements Operator{

    /**
     * Calculate(final int opperand1, final int opperand2) is an Override method from the Operator interface that adds two numbers
     * @param final int opperand1 first command line argument
     * @param final int opperand2 third command line argument
     * @return opperand1 adding opperand2
     */
    @Override
    public int calculate(final int operand1, final int operand2) {
        return operand1 + operand2;
    }
}
