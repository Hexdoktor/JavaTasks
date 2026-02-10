public class MainParallelSum {
    public static void main(String[] args){
        IntArray intArray = new IntArray(100000);

        int cores = Runtime.getRuntime().availableProcessors();

        int sliceSize = intArray.getIntegerArray().length / cores;

        SumThread[] workers = new SumThread[cores];
        Thread[] threads = new Thread[cores];

        for(int i = 0; i < cores; i++){
            int start = i * sliceSize;
            int end = (i == cores - 1) ? intArray.getIntegerArray().length - 1 : (start + sliceSize -1);

            workers[i] = new SumThread(intArray.getIntegerArray(), start, end);
            threads[i] = new Thread(workers[i]);
        }
        for(Thread thread : threads){
                thread.start();
        }

        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long total = 0;

        for(SumThread worker : workers){
            total += worker.getPartialSum();
        }

        System.out.println("The total sum of the integer array is: " + total);
    }
}
