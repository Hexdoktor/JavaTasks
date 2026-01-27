public class Bus extends Car{
    private String typeName;
    private double gasolineLevel;
    private double tankCapacity;
    private double speed;
    private double maxSpeed;
    private int passengerCapacity;
    private int passengersAboard;

    public Bus(String typeName, double gasolineLevel, double tankCapacity, double speed, double maxSpeed, int passengerCapacity){
        super(typeName, gasolineLevel, tankCapacity, speed, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }


    public void passengersEnter(int amount){
        if(passengersAboard < passengerCapacity){
            passengersAboard += amount;
            if (amount > 1){
                System.out.println(amount + " passengers entered. Total passengers: "+ passengersAboard);
            }else{
                System.out.println(amount + " passenger entered. Total passengers" + passengersAboard);
            }
        }else{
            System.out.println("Bus is full.");
        }
    }

    public void passengersExit(int amount){
        passengersAboard -= amount;
        if (amount > 1){
            System.out.println(amount + " passengers left. Total passengers: " + passengersAboard);
        }else if(amount == 1){
            System.out.println(amount + " passenger left. Total passengers: "+ passengersAboard);
        }
    }
}
