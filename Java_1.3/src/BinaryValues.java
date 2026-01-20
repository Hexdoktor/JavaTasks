import java.util.Scanner;

public class BinaryValues {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a binary value: ");
        String binary = reader.nextLine();

        double total = 0;
        int j = 0;

        for(int i = binary.length()-1; i >= 0; i--){
            int bitInt = Integer.parseInt(String.valueOf(binary.charAt(i)));
            double bitIntPowered = Math.pow(2, j);
            j++;
            if (bitInt != 0) {
                total += bitIntPowered;
            }
        }
        System.out.println(total);
    }
}
