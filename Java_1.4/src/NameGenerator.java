import java.util.Scanner;

public class NameGenerator {
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);

        String [] firstNames = {"Juhani", "Maria","Johannes","Helena","Olavi","Johanna","Olavi","Antero","Anneli"};
        String [] lastNames = {"Korhonen", "Virtanen", "Mäkinen", "Nieminen", "Mäkelä","Laine","Hämäläinen", "Heikkinen","Koskinen"};

        System.out.println("How many random names to generate? ");
        int count = Integer.parseInt(reader.nextLine());

        for(int i = 0; i < count; i++){
            int firstIndex = (int)(Math.random() * firstNames.length);
            int lastIndex = (int)(Math.random() * lastNames.length);

            String fullName = firstNames[firstIndex] + " " + lastNames[lastIndex];
            System.out.println(fullName);
        }
    }
}