import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test class for {@Link Calculator}
 *
 * @author Khor Lee Yong, 25/08/2019
 */
public class CalculatorTest {

    @Test
    public void calculate_additionWithoutBrackets_correctAnswer(){
        double actualValue = Calculator.calculate("1 + 1");
        double expectedValue = 1 + 1;
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void calculate_multiplicationWithoutBrackets_correctAnswer(){
        double actualValue = Calculator.calculate("2 * 2");
        double expectedValue = 2 * 2;
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void calculate_longAdditionWithoutBrackets_correctAnswer(){
        double actualValue = Calculator.calculate("1 + 2 + 3");
        double expectedValue = 1 + 2 + 3;
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void calculate_shortDivision_correctAnswer(){
        double actualValue = Calculator.calculate("6 / 2");
        double expectedValue = 6 / 2;
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void calculate_shortAdditionWithDecimals_correctAnswer(){
        double actualValue = Calculator.calculate("11.1 + 23");
        double expectedValue = 11.1 + 23;
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void calculate_longAdditionWithBracketsFront_correctAnswer(){
        double actualValue = Calculator.calculate("( 11.5 + 15.4 ) + 10.1");
        double expectedValue = ( 11.5 + 15.4 ) + 10.1;
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void calculate_longAdditionWithBracketsBack_correctAnswer(){
        double actualValue = Calculator.calculate("23 - ( 29.3 - 12.5 )");
        double expectedValue = 23 - ( 29.3 - 12.5 )     ;
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void calculate_longExpressionWithBrackets_correctAnswer(){
        double actualValue = Calculator.calculate("( 20.0 + ( 4.0 / 2 ) ) + ( 100.54 - 90.53 ) + 10.5");
        double expectedValue = ( 20.0 + ( 4.0 / 2 ) ) + ( 100.54 - 90.53 ) + 10.5;
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void calculate_expressionWithMultiplication_correctAnswer(){
        double actualValue = Calculator.calculate("2 + 3 * 4");
        double expectedValue = 2 + 3 * 4;
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void calculate_complexExpressionWithBrackets_correctAnswer(){
        double actualValue = Calculator.calculate("( ( 2.5 + 3.5 ) - 3 ) / 3 + 2 * 10.0 - 3.5");
        double expectedValue = ( ( 2.5 + 3.5 ) - 3 ) / 3 + 2 * 10.0 - 3.5;
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }
}
