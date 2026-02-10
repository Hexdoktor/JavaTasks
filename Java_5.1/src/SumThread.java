public class SumThread implements Runnable {
    private final int [] intArray;
    private int start;
    private int end;
    private long partialSum;

    public SumThread(int[] intArray, int start, int end){
        this.intArray = intArray;
        this.start = start;
        this.end = end;
    }

    public void run(){
        for(int i = start; i < end; i++){
            partialSum += intArray[i];
        }
    }

    public long getPartialSum(){
        return partialSum;
    }
}
