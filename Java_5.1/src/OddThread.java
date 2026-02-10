class OddThread implements Runnable{
    private int start;
    private int end;

    public OddThread(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run(){
        for(int i = start; i <= end; i++){
            if(i % 2 != 0){
                System.out.println("Odd Thread: " + i);
                try{
                    Thread.sleep(50);
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
