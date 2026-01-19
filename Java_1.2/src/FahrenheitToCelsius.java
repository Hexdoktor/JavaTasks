import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter temperature to convert into Celsius: ");
        double value = Double.parseDouble(reader.nextLine());

        System.out.printf("Temperature converted into Celsius is: %4.1f", (value - 32) / 1.8);
    }
}
