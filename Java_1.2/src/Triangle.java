import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first leg of the triangle: ");
        double leg1 = Double.parseDouble(reader.nextLine());
        System.out.println("Enter the second leg of the triangle: ");
        double leg2 = Double.parseDouble(reader.nextLine());

        System.out.printf("The hypotenuse of the triangle is: %4.2f", Math.sqrt(Math.pow(leg1, 2)+ Math.pow(leg2,2)));
    }
}
