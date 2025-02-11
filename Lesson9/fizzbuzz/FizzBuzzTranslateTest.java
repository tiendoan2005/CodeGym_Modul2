import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    public void testFizzBuzzTranslate() {
        assertEquals("Fizz", FizzBuzzTranslate.translate(3));
        assertEquals("Buzz", FizzBuzzTranslate.translate(5));
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(15));
        assertEquals("Fizz", FizzBuzzTranslate.translate(13));
        assertEquals("Buzz", FizzBuzzTranslate.translate(52));
        assertEquals("hai sau", FizzBuzzTranslate.translate(26));
    }
}