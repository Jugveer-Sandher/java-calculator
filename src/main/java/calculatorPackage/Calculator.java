package calculatorPackage;

/**
 * Calculator class runs all the logic
 * @author Jugveer Sandher
 */
public class Calculator {

    /**
     * Runs the logic of the calculator program and prints out the equation and answer
     * @param final int operand1 first command line argument
     * @param final String operator third command line argument
     * @param final int operand2 third command line argument
     * @throws IllegalArgumentException if a non recognizable operator is found
     */
    public String printCalculated(final int operand1, final int operand2, final String operator) {
        if (operator == null) {
            throw new NullPointerException("Operator cannot be null");
        }

        Operator adding = new AdditionOperator();
        Operator subtracting = new SubtractionOperator();
        Operator multiplying = new MultiplicationOperator();
        Operator dividing = new DivisionOperator();
        String answer;

        if (operator.equals("+")) {
            answer = String.format("%d %s %d = %d", operand1, operator, operand2, adding.calculate(operand1, operand2));
        }

        else if (operator.equals("-")) {
            answer = String.format("%d %s %d = %d", operand1, operator, operand2, subtracting.calculate(operand1, operand2));
        }

        else if (operator.equals("x")) {
            answer = String.format("%d %s %d = %d", operand1, "*", operand2, multiplying.calculate(operand1, operand2));
        }

        else if (operator.equals("/")) {
            answer = String.format("%d %s %d = %d", operand1, operator, operand2, dividing.calculate(operand1, operand2));
        }

        else {
            throw new IllegalArgumentException("Must be in the format of (int) (operator) (int)");
        }
        return answer;
    }

    private static boolean isInt(String number) {
        try {
            Integer.parseInt(number);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}