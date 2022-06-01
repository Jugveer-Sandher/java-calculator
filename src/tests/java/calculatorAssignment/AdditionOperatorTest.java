package calculatorAssignment;

import calculatorPackage.AdditionOperator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Testing for AdditionOperator Class
 * @author Jugveer Sandher
 */

class AdditionOperatorTest {

    /**
     * Testing if adding logic works
     */
    @Test
    void goodCalculate() {
        AdditionOperator adding = new AdditionOperator();
        assertThat(adding.calculate(1,5), equalTo(6));
        assertThat(adding.calculate(-200,65), equalTo(-135));
        assertThat(adding.calculate(5,-10), equalTo(-5));
    }
}