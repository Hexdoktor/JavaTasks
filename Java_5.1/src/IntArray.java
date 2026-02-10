import java.util.Random;

public class IntArray {
    int [] integerArray;

    Random rng = new Random();

    public IntArray(int size){
        integerArray = new int[size];
        for(int i = 0; i < size; i++){
            integerArray[i] = rng.nextInt(1000);
        }
    }

    public int[] getIntegerArray(){
        return integerArray;
    }
}
