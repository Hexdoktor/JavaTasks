import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give coefficient a: ");
        double a = Double.parseDouble(reader.nextLine());
        System.out.println("Give coefficient b: ");
        double b = Double.parseDouble(reader.nextLine());
        System.out.println("Give coefficient c: ");
        double c = Double.parseDouble(reader.nextLine());

        double disc = Math.pow(b,2)-4*a*c;

        if (disc > 0){
            double x1 = (-b + Math.sqrt(disc))/(2*a);
            double x2 = (-b - Math.sqrt(disc))/(2*a);
            System.out.printf("The roots are: %.2f and %.2f", x1,x2);
        }else if(disc == 0){
            double x = (-b + Math.sqrt(disc))/(2*a);
            System.out.println("There is one root: " + x);
        }else if(disc < 0){
            System.out.println("No real roots.");
        }
    }
}
