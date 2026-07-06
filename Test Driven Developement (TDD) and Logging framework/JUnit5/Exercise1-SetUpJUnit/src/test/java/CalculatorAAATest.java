import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setup() {

        System.out.println("Setting up Calculator");

        calculator = new Calculator();
    }

    @After
    public void tearDown() {

        System.out.println("Cleaning up");

        calculator = null;
    }

    @Test
    public void testAdditionAAA() {

        // Arrange
        int a = 15;
        int b = 25;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(40, result);
    }
}