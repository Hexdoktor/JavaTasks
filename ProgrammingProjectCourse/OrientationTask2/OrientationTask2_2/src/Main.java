public class Main {
    public static void main(String[] args){
        EventList list = new EventList();

        list.add(new Event(10.0, EventType.ARRIVAL));
        list.add(new Event(3.0, EventType.EXIT));
        list.add(new Event(2.0, EventType.ARRIVAL));

        Event next = list.removeNext();
        System.out.println("Removed next event: "+ next);

        System.out.println("\nRemaining events in order:");
        for(Event event : list.getEventsInOrder()){
            System.out.println(event);
        }
    }
}
