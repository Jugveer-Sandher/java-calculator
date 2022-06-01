package calculatorAssignment;

import calculatorPackage.Calculator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Calculator class unit test
 * @author Jugveer Sandher
 */
class CalculatorTest {

    /**
     * Unit test for the method printCalculated tests the good calculations
     */
    @Test
    void goodPrintCalculated() {

        Calculator calc = new Calculator();

        assertThat(calc.printCalculated(6, 12, "+"), equalTo("6 + 12 = 18"));
        assertThat(calc.printCalculated(12,6,"-"), equalTo("12 - 6 = 6"));
        assertThat(calc.printCalculated(12,6,"x"), equalTo("12 * 6 = 72"));
        assertThat(calc.printCalculated(12,6,"/"), equalTo("12 / 6 = 2"));
    }

    /**
     * Test for nullpointer if a null operator is implemented as a papameter
     */
    @Test
    void NullPrintCalculated() {
        Calculator calc = new Calculator();

        final NullPointerException ex2;

            ex2 = assertThrows(NullPointerException.class, () -> calc.printCalculated(2, 4, null));
            assertThat(ex2.getMessage(), equalTo("Operator cannot be null"));
    }

    /**
     * Test to run the fail cases
     */
    @Test
    void badPrintCalculated(){
        badPrintCalculated(1,7,"z");
        badPrintCalculated(1,5,"*");
        badPrintCalculated(5,1000,"\\");
        badPrintCalculated(1,5,"_");
        badPrintCalculated(1,5,"  ");
        badPrintCalculated(1,5,"");
    }

    /**
     * Fail cases logic
     * @param num1
     * @param num2
     * @param operator
     */
    void badPrintCalculated(int num1, int num2, String operator) {
        Calculator calc = new Calculator();
        final IllegalArgumentException ex;

        ex = assertThrows(IllegalArgumentException.class, () -> calc.printCalculated(num1, num2, operator));
        assertThat(ex.getMessage(), equalTo("Must be in the format of (int) (operator) (int)"));
    }
}