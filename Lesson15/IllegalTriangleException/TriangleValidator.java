public class TriangleValidator {
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Các cạnh không phải số dương.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng 2 cạnh không lớn hơn cạnh còn lại");
        }
    }
}
