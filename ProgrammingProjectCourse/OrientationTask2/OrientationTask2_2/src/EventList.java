import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.PriorityQueue;

public class EventList {
    private final PriorityQueue<Event> queue = new PriorityQueue<>();

    public void add(Event event){
        queue.add(event);
    }

    public Event removeNext(){
        return queue.poll();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public List<Event> getEventsInOrder(){
        List<Event> list = new ArrayList<>(queue);
        Collections.sort(list);
        return list;
    }
}
