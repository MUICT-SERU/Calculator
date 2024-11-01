import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatorTest {

    @Test 
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, 3), 0);
    }
    @Test
    public void testAddWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.add(-5, 3), 0);
    }
    
    @Test
    public void testAddWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(5, 0), 0);
    }
}
