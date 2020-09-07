import com.company.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CalculatorTest {

private Calculator calculator;

    @Before
    public void createCalculator (){
        calculator = new Calculator();
    }

    @Test
    public void testPlus(){
        final Integer a = 5;
        final Integer b = 6;
        final Integer result = 11;

        Assert.assertEquals(result, calculator.plus.apply(a, b), 1e-9);

    }

    @Test
    public void testIsPositive(){
        Assert.assertTrue(calculator.isPositive.test(-2));
    }

    @Test
    public void testAbs() {
        final Integer a = -455;
        final Integer result = 455;
        Assert.assertEquals(result, calculator.abs.apply(a));
    }

    @org.junit.jupiter.api.Test
    public void testDevideException() {
        final Integer a = 6;
        final Integer b = 0;
        Assertions.assertThrows(NullPointerException.class, () -> {
            calculator.devide.apply(a, b);
        });
    }

    @Test
    public void testPow() {
        assertThat(calculator.pow.apply(7), is(49));
    }

    @Test
    public void calculatorClass() {
        assertThat(calculator, instanceOf(Calculator.class));
    }
}
