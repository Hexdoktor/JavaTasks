public class Customer {
    private int id;
    private long arrivalTime;
    private long endTime;
    private static int customerCount;


    public Customer(){
        this.arrivalTime = System.nanoTime();
        customerCount++;
        this.id = customerCount;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public void setArrivalTime(long time){this.arrivalTime = time;}

    public void setStartTime(){
        this.arrivalTime = System.nanoTime();
    }

    public void setEndTime(){
        this.endTime = System.nanoTime();
    }

    public long timeSpentInQueue(){
        return endTime - arrivalTime;
    }


    public int getCustomerId(){
        return id;
    }

    public long getArrivalTime(){
        return arrivalTime;
    }

    public long getEndTime(){
        return endTime;
    }
}
