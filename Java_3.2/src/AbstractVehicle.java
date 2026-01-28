public abstract class AbstractVehicle implements Vehicle, ElectricVehicle{
    protected double maxSpeed;
    protected double currentSpeed;
    protected double weight;
    protected String brand;
    protected String model;
    protected String color;
    protected int year;
    protected boolean running;
    protected double fuelEfficiency;

    public AbstractVehicle(double maxSpeed, double currentSpeed, double weight, String brand, String model, String color, int year, boolean running, double fuelEfficiency){
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.weight = weight;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.running = running;
        this.fuelEfficiency = fuelEfficiency;
    }


    //template method pattern
    public final void start(){
        running = true;
        onStart();
    }
    public final void stop(){
        running = false;
        onStop();
    }

    protected void onStart(){}
    protected void onStop(){}


    //default for non electronic vehicles
    @Override
    public void charge(){
        System.out.println("Charging not possible for this vehicle type.");
    }

    //shared behavior
    public void accelerate(double amount){
        currentSpeed = Math.min(maxSpeed, currentSpeed + amount);
    }

    public void decelerate(double amount){
        if(amount > 0){
            currentSpeed = Math.min(0, currentSpeed - amount);
        }
    }

    @Override
    public double calculateFuelEfficiency(){
        return fuelEfficiency;
    }

    public void honk(){
        System.out.println("Honk honk");
    }

    public boolean isMoving(){
        return currentSpeed > 0;
    }

    public boolean isRunning(){
        return running;
    }

    public double getSpeed(){
        return currentSpeed;
    }

    public String getInfo() {
        return "Brand: "+brand+", Model: "+model+", Color: "+color+", Year: "+year+", Weight: "+weight;
    }
}
