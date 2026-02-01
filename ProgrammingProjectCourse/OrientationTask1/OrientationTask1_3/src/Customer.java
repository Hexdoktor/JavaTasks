public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    private static int customerCount;


    public Customer(){
        this.startTime = System.currentTimeMillis();
        customerCount++;
        this.id = customerCount;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public void setStartTime(){
        this.startTime = System.currentTimeMillis();
    }

    public void setEndTime(){
        this.endTime = System.currentTimeMillis();
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
