import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Arr1 = {1, 2, 3, 4, 5};
        int[] Arr2 = {10, 11, 12, 13, 14, 15};

        System.out.println("Mảng của ba sau kkhi gộp: ");
        int[] newArr = mergeArrays(Arr1, Arr2);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[i + arr1.length] = arr2[i];
        }
        return newArray;
    }
}
