import java.util.Scanner;
import java.util.ArrayList;

class BubbleSort {
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
        ArrayList<Integer> sorted_list = bubblesort(num, n);
        System.out.print("Sorted List: " + sorted_list);
        input.close();
    }

    static ArrayList<Integer> bubblesort(ArrayList<Integer> num, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (num.get(j) > num.get(j + 1)) {
                    num.set(j, (num.get(j) + num.get(j + 1)));
                    num.set(j + 1, (num.get(j) - num.get(j + 1)));
                    num.set(j, (num.get(j) - num.get(j + 1)));
                }
            }
        }
        return num;
    }

}