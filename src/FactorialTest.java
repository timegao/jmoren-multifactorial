import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @org.junit.jupiter.api.Test
    void getFactorial() {
        assertEquals(120, Factorial.getFactorial(5));
    }
}