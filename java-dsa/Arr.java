import java.util.Scanner;
import java.util.ArrayList;

class Arr {
    public static void main(String[] args) {
        // int[] arr = new int[5];
        // Scanner num = new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print("Enter number " + (i + 1) + ": ");
        // arr[i] = num.nextInt();
        // }

        // for (int a : arr) {
        // System.out.println(a);
        // }
        // num.close();
        // Multi Dimensional ArrayList
        Scanner num2 = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(num2.nextInt());
            }
        }

        System.out.println(list);
        num2.close();
    }
}