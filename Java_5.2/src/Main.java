public class Main {
    public static void main(String[] args){
        TicketSystem ticketSystem = new TicketSystem(20);
        Thread [] customers = new Thread[20];

        for(int i = 0; i<customers.length; i++){
            int seatsWanted = (int)(Math.random()*4)+1;
            customers[i] = new Thread(new CustomerThread(ticketSystem, seatsWanted));

        }

        for (Thread customer : customers){
            customer.start();
        }

        for (Thread customer : customers){
            try{
                customer.join();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }

        System.out.println("All customers processed.");
    }
}
