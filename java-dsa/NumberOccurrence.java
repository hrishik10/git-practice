import java.util.Scanner;

class NumberOccurrence {

    public static void main(String[] args) {
        int count = 0;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = number.nextInt();
        System.out.println("Enter the number of which you want to check number of occurrences");
        int occur = number.nextInt();
        while (no != 0) {
            int n = no % 10;
            no = no / 10;
            if (n == occur)
                count += 1;
        }
        System.out.println(count);
        number.close();

    }
}