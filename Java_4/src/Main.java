public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        calc.add(5);
        calc.add(10);
        calc.add(20);

        System.out.println("Current value: " + calc.getValue());

        calc.reset();
        System.out.println("After reset: " + calc.getValue());

    }
}
