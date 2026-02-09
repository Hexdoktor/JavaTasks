public class ClockTest {
    public static void main(String [] args){
        Clock clock = Clock.getInstance();

        System.out.println("Initial time: " + clock.getTime());

        clock.setTime(10.0);
        System.out.println("After setTime: " + clock.getTime());

        clock.advance(20.0);
        System.out.println("After advance: " + clock.getTime());

        Clock anotherClock = Clock.getInstance();
        System.out.println("Another reference time: " +anotherClock.getTime());
    }
}
