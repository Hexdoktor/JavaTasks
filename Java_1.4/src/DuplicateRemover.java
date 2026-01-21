import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("How many integers to enter? ");
        int n = Integer.parseInt(reader.nextLine());

        int[]arr = new int[n];

        System.out.println("Enter the integers");
        for(int i = 0; i < n; i ++){
            arr[i] = Integer.parseInt(reader.nextLine());
        }
        // new array
        int [] unique = new int[n];
        int uniqueCount = 0;
        // loop through the original array
        for(int i = 0; i < n; i++){
            int current = arr[i];
            boolean seenBefore = false;

            // check for number in unique array
            for(int j = 0; j < uniqueCount; j++){
                if(unique[j] == current){
                    seenBefore = true;
                    break;
                }
            }

            // if not seen before, add to array
            if(!seenBefore){
                unique[uniqueCount] = current;
                uniqueCount++;
            }
        }
        // show results
        System.out.println("Array without duplicates:");
        for(int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
