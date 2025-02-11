import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleClassifierTest {
    @Test
    public void testEquilateralTriangle() {
        assertEquals("tam giac deu", TriangleClassifier.classify(2, 2, 2));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("tam giac can", TriangleClassifier.classify(2, 2, 3));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("tam giac thuong", TriangleClassifier.classify(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("khong phai la tam giac", TriangleClassifier.classify(8, 2, 3));
        assertEquals("khong phai la tam giac", TriangleClassifier.classify(-1, 2, 1));
        assertEquals("khong phai la tam giac", TriangleClassifier.classify(0, 1, 1));
    }
}
