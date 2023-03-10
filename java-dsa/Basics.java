import java.util.Scanner;

class Basics {
    public static void main(String[] args) {
        Scanner Temp = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float TempC = Temp.nextFloat();
        float TempF = (TempC * 1.8f) + 32;
        System.out.print("Temperature in Fahrenheit is " + TempF);
        Temp.close();
    }
}