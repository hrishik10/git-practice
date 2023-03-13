import java.util.Scanner;
import java.util.ArrayList;

class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        System.out.print("Enter the number of elements you want:");
        int n = input.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number " + (i + 1) + ":");
            num.add(i, input.nextInt());
        }
        System.out.println("Unsorted List: " + num);
        selectionsort(num, n);
        System.out.print("Sorted List: " + num);
        input.close();
    }

    static void selectionsort(ArrayList<Integer> num, int n) {
        for (int i = 0; i < n; i++) {
            // Find the max item in remaining array and swap with correct index
            int last = n - i - 1;
            int max_elementIndex = getIndex(num, 0, last);
            swap(num, max_elementIndex, last);
        }

    }

    static int getIndex(ArrayList<Integer> num, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (num.get(max) < num.get(i)) {
                max = i;
            }
        }
        return max;
    }

    static void swap(ArrayList<Integer> num, int max_element_index, int end) {

        int temp = num.get(max_element_index);
        num.set(max_element_index, num.get(end));
        num.set(end, temp);

    }
}
