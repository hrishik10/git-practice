import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Take an input");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        // System.out.println("Output is: " + input.nextLine());
        System.out.println("Output is: " + sum);
        // System.out.println("Output is:");

        input.close();
        // long largeNumber = 1584584382684328211l;
        // float marks = 67.34f;
        // double Double = 1524.14213123123;
    }
}
// Not String is not a primitive Data Type
// type "psvm" to create main class
