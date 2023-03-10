import java.util.Scanner;

class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().trim().charAt(0); // trim() method removes spaces between all characters
        if (c >= 'a' && c <= 'z') {
            System.out.println("It is a lowercase letter");

        } else {
            System.out.println("It is a uppercase letter");
        }

        in.close();
    }

}