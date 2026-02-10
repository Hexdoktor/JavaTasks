public class CustomerThread implements Runnable {
    private TicketSystem ticketSystem;
    private int seatsRequested;
    private int customerId;
    private static int customerCount;

    public CustomerThread(TicketSystem ticketSystem, int seatsRequested){
        customerCount++;
        this.ticketSystem = ticketSystem;
        this.seatsRequested = seatsRequested;
        this.customerId = customerCount;
    }

    @Override
    public void run(){
        boolean success = ticketSystem.reserve(seatsRequested);

        if(success){
            System.out.println("Customer " + customerId + " successfully reserved " + seatsRequested + " seats.");
        }else{
            System.out.println("Customer " + customerId + " failed to reserve "+ seatsRequested + " seats. No seats available.");
        }
    }

}
