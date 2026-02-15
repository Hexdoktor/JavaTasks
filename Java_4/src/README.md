# Calculator (MVC Model Example)

This project contains a simple "Calculator" class used to demonstrate GitHub Copilot's ability to generate code and explanations.
The calculator can sum positive integers, reset its value, and return the current total.
Negative Integers are not allowed and will cause an exception.

---

## Calculator Class
```java
public class Calculator {
    private int value = 0;
    
    //Resets the calculator to zero
    public void reset(){
        value = 0;
    }
    
    //Adds a positive integer, throws exception for negative
    public void add(int number){
        if(number < 0}{
            throw new IllegalArgumentException("Negative numbers not allowed.");
        }
        value += number;
     }
     
     //Returns the current value
     public int getValue(){
     return value;}
}