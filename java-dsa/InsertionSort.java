
// import java.util.Scanner;
// import java.util.ArrayList;
import java.util.Arrays;

class InsertionSort {

    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // ArrayList<Integer> num = new ArrayList<>();
        // System.out.print("Enter the number of elements you want:");
        // int n = input.nextInt();
        // System.out.println();
        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter the number " + (i + 1) + ":");
        // num.add(i, input.nextInt());
        // }
        // System.out.println("Unsorted List: " + num);
        int[] num = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18, 90, 87, 30, 9, 12, 41, 13, 80, 67, 70 };
        // insertionsort(num, n);
        insertionsort(num, num.length);
        System.out.print("Sorted List: " + Arrays.toString(num));
        // input.close();
    }

    // static void insertionsort(ArrayList<Integer> num, int n) {
    // for (int i = 0; i < n - 1; i++) {
    // for (int j = i + 1; j > 0; j--) {
    // if (num.get(j) < num.get(j - 1)) {
    // int temp = num.get(j);
    // num.set(j, num.get(j - 1));
    // num.set(j - 1, temp);
    // }
    // }

    // }
    // }
    static void insertionsort(int[] num, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (num[j] < num[j - 1]) {
                    int temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                } else
                    break;
            }

        }
    }
}