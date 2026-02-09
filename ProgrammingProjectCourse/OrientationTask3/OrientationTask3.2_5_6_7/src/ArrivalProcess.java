import distributions.*;

public class ArrivalProcess {
    private ContinuousGenerator generator;
    private EventType type;

    public ArrivalProcess(ContinuousGenerator generator, EventType type) {
        this.generator = generator;
        this.type = type;
    }

    public void generateNext(EventList list){
        double interval = generator.sample();
        double currentTime = Clock.getInstance().getTime();
        double eventTime = currentTime + interval;

        Event event = new Event(eventTime, type);
        list.add(event);
        Clock.getInstance().setTime(eventTime);
    }
}