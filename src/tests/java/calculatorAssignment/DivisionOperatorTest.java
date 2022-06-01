package calculatorAssignment;

import calculatorPackage.DivisionOperator;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Unit test for DivisonOperator class
 * @author Jugveer Sandher
 */
class DivisionOperatorTest {

    /**
     * Test for divison operator does not handle dividing by zero
     */
    @Test
    void goodCalculate() {
        DivisionOperator dividing = new DivisionOperator();

        assertThat(dividing.calculate(10,5), equalTo(2));
        assertThat(dividing.calculate(5,2), equalTo(2));
        assertThat(dividing.calculate(-100,-2), equalTo(50));
        assertThat(dividing.calculate(-100,2), equalTo(-50));
    }
}