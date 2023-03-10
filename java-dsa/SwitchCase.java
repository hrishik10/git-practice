import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String fruit = s.next();

        switch (fruit) {

            case "Mango" -> System.out.println("king of fruits");
            case "Apple" -> System.out.println("A red fruit");
            case "Orange" -> System.out.println("Citrus fruit");
            case "Grape" -> System.out.println("Small  fruit");
            default -> System.out.println("Enter valid fruit");

        }

        // == check the reference, if both the variables are pointing to same object.
        s.close();
    }

}