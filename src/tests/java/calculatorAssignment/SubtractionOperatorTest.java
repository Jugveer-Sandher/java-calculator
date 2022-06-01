package calculatorAssignment;

import calculatorPackage.SubtractionOperator;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Unit Test for SubtractionOperator class
 * @author Jugveer Sandher
 */
class SubtractionOperatorTest {

    /**
     * Unit test for subtraction calculated method
     */
    @Test
    void calculate() {
        SubtractionOperator sub = new SubtractionOperator();

        assertThat(sub.calculate(10,2), equalTo(8));
        assertThat(sub.calculate(2,10), equalTo(-8));
        assertThat(sub.calculate(-10, 2), equalTo(-12));
        assertThat(sub.calculate(-10,-2), equalTo(-8));
        assertThat(sub.calculate(38,12), equalTo(26));
    }
}