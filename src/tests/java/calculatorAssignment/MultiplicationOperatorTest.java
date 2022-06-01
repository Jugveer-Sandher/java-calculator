package calculatorAssignment;

import calculatorPackage.MultiplicationOperator;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Unit test for MultiplicationOperator class
 * @author Jugveer Sandher
 */
class MultiplicationOperatorTest {

    /**
     * Test the multiplicationOperator calculated method
     */
    @Test
    void goodCalculate() {
        MultiplicationOperator multi = new MultiplicationOperator();

        assertThat(multi.calculate(2,2), equalTo(4));
        assertThat(multi.calculate(-10,10), equalTo(-100));
        assertThat(multi.calculate(-5,-4), equalTo(20));
        assertThat(multi.calculate(7,-6), equalTo(-42));
    }
}