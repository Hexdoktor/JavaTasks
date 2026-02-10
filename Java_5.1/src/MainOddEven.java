public class MainOddEven {
    public static void main(String[] args){
        Thread odd = new Thread(new OddThread(1,20));
        Thread even = new Thread(new EvenThread(1,20));

        odd.start();
        even.start();
    }
}
