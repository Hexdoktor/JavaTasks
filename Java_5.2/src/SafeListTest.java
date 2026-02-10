public class SafeListTest {
    public static void main(String[] args){
        SafeList<String> safeList = new SafeList<>();
        Thread[] threads = new Thread[50];

        for (int i = 0; i < threads.length; i++){
            int id  = 1;
            threads[i] = new Thread(()->{
                for(int j = 0; j<1000; j++){
                    safeList.add("Thread-"+id+"-Item-"+j);
                    if(j%2 == 0){
                        safeList.remove("Thread-"+id+"-Item-"+(j-2));
                    }
                }
            });
        }

        for(Thread t : threads){
            t.start();
        }

        for(Thread t : threads){
            try {
                t.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("Final size: " + safeList.size());
    }
}
