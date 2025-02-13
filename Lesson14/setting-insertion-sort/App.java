public class App {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            // Shift elements of list[0..i-1] that are greater than key to the right
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;  // **Fix: Decrement j to avoid infinite loop**
            }
            list[j + 1] = key; // Place key at its correct position
        }
    }

    public static void main(String[] args) {
        int[] list = {56, 78, 3, 5, 6, 25, 77, 13, 60};

        System.out.println("Mảng trước khi sắp xếp: ");
        for (int num : list) {
            System.out.print(num + " ");
        }

        System.out.println("\nBắt đầu sắp xếp....");
        insertionSort(list);

        System.out.println("Mảng sau khi sắp xếp: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
