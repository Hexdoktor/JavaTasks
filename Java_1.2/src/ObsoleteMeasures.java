import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double luoti = 13.28;
        double naula = 32*luoti;
        double leiviska = naula*20;

        System.out.println("Weight (grams): ");
        double weight = Double.parseDouble(reader.nextLine());

        int leiviskat = (int) (weight / leiviska);
        int naulat = (int) ((weight % leiviska) / naula);
        double luodit = ((weight % leiviska) % naula) / luoti;

        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.", weight, leiviskat, naulat, luodit);

    }
}
