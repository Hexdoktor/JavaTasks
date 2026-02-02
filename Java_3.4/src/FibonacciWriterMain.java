import java.io.*;

public class FibonacciWriterMain {
    public static void main(String[] args){
        try(Writer writer = new FileWriter("fibonacci.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer)){

            long a = 0;
            long b = 1;
            for(int i = 0; i < 60 ; i++){
                bufferedWriter.write(String.valueOf(a));
                bufferedWriter.newLine();
                long next = a + b;
                a = b;
                b = next;
            }
        } catch (IOException e) {
            System.out.println("Error writing fibonacci file: " + e.getMessage());
        }
    }
}
