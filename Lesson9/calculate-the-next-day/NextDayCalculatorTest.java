import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextDayCalculatorTest {
    @Test
    public void testNextDay() {
        assertArrayEquals(new int[]{2, 1, 2018}, NextDayCalculator.getNextDay(1, 1, 2018));
    }

    @Test
    public void testNextDay2() {
        assertArrayEquals(new int[]{1, 2, 2018}, NextDayCalculator.getNextDay(31, 1, 2018));
    }

    @Test
    public void testNextDay3() {
        assertArrayEquals(new int[]{1, 5, 2018}, NextDayCalculator.getNextDay(30, 4, 2018));
    }

    @Test
    public void testNextDay4() {
        assertArrayEquals(new int[]{1, 3, 2018}, NextDayCalculator.getNextDay(28, 2, 2018));
    }

    @Test
    public void testNextDay5() {
        assertArrayEquals(new int[]{1, 3, 2020}, NextDayCalculator.getNextDay(29, 2, 2020));
    }

    @Test
    public void testNextDay6() {
        assertArrayEquals(new int[]{1, 1, 2019}, NextDayCalculator.getNextDay(31, 12, 2018));
    }
}
