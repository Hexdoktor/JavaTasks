import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many integers will you enter?");
        int n = Integer.parseInt(reader.nextLine());

        int[] arr = new int[n];

        System.out.println("Enter the integers:");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(reader.nextLine());

        }

        int maxSum = Integer.MIN_VALUE;
        int bestStart = 0;
        int bestEnd = 0;

        // check all possible subarrays
        for(int start = 0; start < n; start++) {
            int currentSum = 0;
            for(int end = start; end < n; end ++){
                currentSum += arr[end];

                if(currentSum > maxSum){
                    maxSum = currentSum;
                    bestStart = start;
                    bestEnd = end;
                }
            }
        }
        System.out.println("Max subarray sum: " + maxSum);
        System.out.println("Subarray indices: " + (bestStart + 1) + "-" + (bestEnd + 1));
    }
}
