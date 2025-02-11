import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAbsolute {
    @Test
    public void TestCase1(){
        int num = -1;
        int exp = 1;
        int actual = AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(exp, actual);
    }
    @Test
    public void TestCase2(){
        int num = 0;
        int exp = 0;
        int actual = AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(exp, actual);
    }
    @Test
    public void TestCase3(){
        int num = 1;
        int exp = 1;
        int actual = AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(exp, actual);
    }
}
