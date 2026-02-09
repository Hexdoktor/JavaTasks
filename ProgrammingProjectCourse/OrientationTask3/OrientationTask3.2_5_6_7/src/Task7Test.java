import distributions.*;

public class Task7Test {
    public static void main(String[] args){
        //reset the simulation clock
        Clock.getInstance().setTime(0);
        //create a new event list
        EventList list = new EventList();
        //create a new arrival process with exponential distribution
        ContinuousGenerator generator = new Negexp(5.0);
        ArrivalProcess ap = new ArrivalProcess(generator,EventType.ARRIVAL);

        //generate 10 arrival events
        for (int i = 0; i < 10; i++){
            ap.generateNext(list);
        }
        //print time on clock after generating events
        System.out.println("Clock time after generating events: " + Clock.getInstance().getTime());

        //create a new service point
        ServicePoint sp = new ServicePoint();

        //process all events in the event list
        //for each event, create a customer and store arrival time
        while(!list.isEmpty()){
            Event event = list.removeNext();
            double eventTime = event.getTime();
            Customer c = new Customer();
            long arrivalTime = (long)eventTime;
            c.setArrivalTime(arrivalTime);
            sp.addToQueue(c);
        }

        //move the clock forward
        Clock.getInstance().advance(5);

        //serve customers one by one
        long exitTime = (long)Clock.getInstance().getTime();

        System.out.println("\nServing customers:");
        while(!sp.isEmpty()){
            Customer c = sp.removeFromQueue();
            long arrival = c.getArrivalTime();
            long timeSpent = exitTime - arrival;

            System.out.println("Arrival: " + arrival + ",  Exit: " + exitTime + ", Time spent in system: " + timeSpent);
        }
    }
}
