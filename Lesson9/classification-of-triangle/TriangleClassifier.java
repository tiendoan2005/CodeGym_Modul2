public class TriangleClassifier {
    public static String classify(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            return "khong phai la tam giac";
        }
        if (a == b && b == c) {
            return "tam giac deu";
        }
        if (a == b || b == c || a == c) {
            return "tam giac can";
        }
        return "tam giac thuong";
    }
}