import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second integer: ");
        int second = Integer.parseInt(reader.next());

        for (int i = first; i <= second; i++) {
            if (i < 2) {
                continue;
            }
            if (i == 2) {
                System.out.println((i));
                continue;
            }
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }
    }
}
