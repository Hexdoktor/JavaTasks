import java.util.LinkedList;

public class ServicePoint {
    private long totalServiceTime = 0;
    private int servedCustomers = 0;
    private int servicePointId;
    private LinkedList<Customer> customers = new LinkedList<>();
    private static int totalServicePoints;


    public ServicePoint(){
        totalServicePoints++;
        this.servicePointId = totalServicePoints;
    }

    public void addToQueue(Customer customer){
        customers.addFirst(customer);
    }

    public Customer removeFromQueue(){
        Customer served = customers.removeLast();
        return served;
    }

    public long getAverageServiceTime(){
        if(servedCustomers == 0){return 0;}
        return totalServiceTime / servedCustomers;
    }

    public boolean isEmpty(){
        return customers.isEmpty();
    }


    public void serve(){
        while(!customers.isEmpty()){
            Customer c = removeFromQueue();

            long serviceTime = (long)(Math.random()*1000);
            long serviceNanos = serviceTime * 1_000_000;

            try{
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            c.setEndTime();

            long waiting = c.timeSpentInQueue();
            long response = waiting + serviceNanos;

            totalServiceTime += serviceNanos;
            servedCustomers++;

            System.out.println("Customer " + c.getCustomerId()+ " served.");
            System.out.println("Waiting time: " + waiting + " ns.");
            System.out.println("Service time: " +serviceNanos+ " ns");
            System.out.println("Response time: " +response+ " ns");
        }
        System.out.println("No customers in queue.");
        System.out.println("Average service time for customers served at Service Point "+servicePointId+" : "+getAverageServiceTime()+" ns");
    }
}
