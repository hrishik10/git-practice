import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        int p = 0;
        int i = 1;
        Scanner no = new Scanner(System.in);
        int n = no.nextInt();
        if (n == 1)
            System.out.println(p);

        else if (n == 2)
            System.out.print(p + " " + i);
        else {
            System.out.print(p + " " + i + " ");
            for (int j = 3; j <= n; j++) {
                int temp = p + i;
                p = i;
                i = temp;
                System.out.print(i + " ");
            }
        }
        no.close();
    }

}
