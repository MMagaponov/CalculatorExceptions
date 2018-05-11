import com.agaponov.calculatorsolution.Calculator;
import com.agaponov.calculatorsolution.UnexpectedCases.UnknownOperation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;



public class CalculatorTests {
    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Before each test");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
      calculator = null;
    }

    @Test
    public void shouldAddTwoPositiveNumbers() throws UnknownOperation {
        double a = 100;
        double b = 500;
        String addition = "+";

       double result = calculator.calculate(a,b,addition);

       assertThat(result).isEqualTo(600);
    }

    @Test
    public void shouldThrowExceptionIfOperationIsWrong() throws UnknownOperation {
        double a = 100;
        double b = 500;
        final String operation = "bla";

        assertThatThrownBy(() -> calculator.calculate(a,b,operation)).isInstanceOf(UnknownOperation.class);


    }

}
