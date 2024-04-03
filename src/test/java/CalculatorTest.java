import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(5.0, Calculator.calculate(2.0, 3.0, "+"));
    }

    @Test
    void testSubtraction() {
        assertEquals(-1.0, Calculator.calculate(2.0, 3.0, "-"));
    }

    @Test
    void testMultiplication() {
        assertEquals(6.0, Calculator.calculate(2.0, 3.0, "*"));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, Calculator.calculate(6.0, 3.0, "/"));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.calculate(6.0, 0.0, "/");
        });
    }

    @Test
    void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.calculate(2.0, 3.0, "%");
        });
    }
}
