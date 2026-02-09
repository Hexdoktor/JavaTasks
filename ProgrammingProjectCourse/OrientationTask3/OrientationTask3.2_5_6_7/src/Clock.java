public class Clock {
    private static Clock instance = null;
    private double time;

    private Clock(){
        this.time = 0;
    }

    public static Clock getInstance(){
        if(instance == null){
            instance = new Clock();
        }
        return instance;
    }

    public double getTime(){
        return time;
    }

    public void setTime(double newTime){
        time = newTime;
    }

    public void advance(double moveTime){
        this.time += moveTime;
    }
}
