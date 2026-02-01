public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    private static int customerCount;


    public Customer(){
        this.startTime = System.nanoTime();
        customerCount++;
        this.id = customerCount;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public void setStartTime(){
        this.startTime = System.nanoTime();
    }

    public void setEndTime(){
        this.endTime = System.nanoTime();
    }

    public long timeSpentInQueue(){
        return endTime - startTime;
    }


    public int getCustomerId(){
        return id;
    }

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }
}
