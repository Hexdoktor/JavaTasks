import java.util.LinkedList;
import java.util.Scanner;

public class CustomerUser{
    public static void main(String[] args){
        LinkedList<Customer> customers = new LinkedList<>();
        Scanner reader = new Scanner(System.in);

        System.out.println("\nChoose action:");
        System.out.println("1 = Add customer to queue");
        System.out.println("2 = Serve next customer");
        System.out.println("0 = Exit");

        int userAnswer = Integer.parseInt(reader.nextLine());

        while(userAnswer != 0){
            if (userAnswer == 1){
                customers.addFirst(new Customer());
                System.out.println("New customer added to the queue. Customers in queue: " +customers.size());
            }else if(userAnswer == 2 && !customers.isEmpty()) {
                Customer served = customers.removeLast();
                System.out.println("Customer removed from the queue. Customers in queue: " + customers.size());
                served.setEndTime();
                System.out.println("Customer " +served.getCustomerId() + " spent " + served.timeSpentInQueue() + " ns in queue.");
            }else if(userAnswer == 2 && customers.isEmpty()){
                System.out.println("No customers in queue.");
            }
            System.out.println("\nChoose action:");
            System.out.println("1 = Add customer to queue");
            System.out.println("2 = Serve next customer");
            System.out.println("0 = Exit");
            userAnswer = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Program interrupted by user.");
    }
}