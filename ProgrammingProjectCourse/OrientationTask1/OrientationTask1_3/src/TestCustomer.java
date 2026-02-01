public class TestCustomer {
    public static void main(String[] args){
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();


        System.out.println("Customer "+customer1.getCustomerId()+ " entered, start time: "+customer1.getStartTime());
        System.out.println("Customer "+customer2.getCustomerId()+ " entered, start time: "+customer2.getStartTime());
        System.out.println("Customer "+customer3.getCustomerId()+ " entered, start time: "+customer3.getStartTime());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        customer1.setEndTime();
        customer2.setEndTime();
        customer3.setEndTime();

        System.out.println("Customer "+customer1.getCustomerId()+ " served, end time: "+customer1.getEndTime()+", total time in queue: "+customer1.timeSpentInQueue());
        System.out.println("Customer "+customer2.getCustomerId()+ " served, end time: "+customer2.getEndTime()+", total time in queue: "+customer2.timeSpentInQueue());
        System.out.println("Customer "+customer3.getCustomerId()+ " served, end time: "+customer3.getEndTime()+", total time in queue: "+customer3.timeSpentInQueue());

    }
}
