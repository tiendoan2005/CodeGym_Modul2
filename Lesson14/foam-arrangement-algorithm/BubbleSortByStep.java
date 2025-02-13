public class BubbleSortByStep {
    public static void bubbleSortByStep(int[] list) {
        boolean needNextStep = true;
        for (int i = 1; i < list.length && needNextStep; i++) {
            needNextStep = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextStep = true;
                }
            }
        }
    }
}
