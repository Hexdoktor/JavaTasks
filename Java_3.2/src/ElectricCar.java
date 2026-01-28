public class ElectricCar extends AbstractVehicle{
    private double batteryLevel;
    private double batteryCapacity;

    public ElectricCar(double maxSpeed, double currentSpeed, double weight, String brand, String model, String color, int year, boolean running, double batteryLevel, double batteryCapacity, double fuelEfficiency){
        super(maxSpeed,currentSpeed,weight,brand,model,color,year,running,fuelEfficiency);
        this.batteryLevel = batteryLevel;
        this.batteryCapacity = batteryCapacity;

    }

    @Override
    protected void onStart(){
        System.out.println("The electric car powers on.");
    }

    @Override
    protected void onStop(){
        System.out.println("The electric car powers off.");
    }

    @Override
    public void charge(){
        batteryLevel = batteryCapacity;
        System.out.println("The electric car is now fully loaded");
    }

    @Override
    public void accelerate(double amount){
        super.accelerate(amount);
        System.out.println("The electric car "+brand+" "+model+" accelerates.");
    }

    @Override
    public void decelerate(double amount){
        super.decelerate(amount);
        System.out.println("The electric car "+brand+" "+model+" decelerates.");
    }


    @Override
    public String getInfo(){
        return super.getInfo() + ", Type: Electric Car, Battery: "+batteryLevel+"/"+batteryCapacity;
    }
}
