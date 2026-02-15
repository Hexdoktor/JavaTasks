public class Calculator{
    private int value = 0;

    public void reset(){
        value = 0;
    }

    public void add(int number){
        if(number < 0){
            throw new IllegalArgumentException(("Negative numbers are not allowed"));
        }
        value += number;
    }

    public int getValue(){
        return value;
    }
}