import java.util.Scanner;

class LinearSearch {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int[] arr = { 133, 544, 3, 77, 188, 13, 67, 1000 };
        int n = num.nextInt();
        int number = linearsearch(n, arr);

        if (n == number)
            System.out.print("Found");
        else
            System.out.print("Not Found");
        num.close();
    }

    static int linearsearch(int no, int[] ar) {

        for (int a : ar) {
            if (a == no)
                return a;
        }

        return 0;
    }
}