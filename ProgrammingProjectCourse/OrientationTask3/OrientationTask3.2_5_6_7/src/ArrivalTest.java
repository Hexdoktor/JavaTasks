import distributions.*;

public class ArrivalTest {
    public static void main(String[] args){
        Clock.getInstance().setTime(0);
        EventList list = new EventList();
        ContinuousGenerator generator = new Negexp(5.0);
        ArrivalProcess ap = new ArrivalProcess(generator, EventType.ARRIVAL);

        for (int i = 0; i < 10; i++){
            ap.generateNext(list);
        }

        System.out.println("Generated events: ");
        for(Event event : list.getEventsInOrder()){
            System.out.println(event);
        }

        System.out.println("\nFinal clock time: " + Clock.getInstance().getTime());
    }
}
