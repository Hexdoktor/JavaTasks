public class AbstractVehicle {
    public double maxSpeed;
    public double currentSpeed;
    public double weight;
    public String brand;
    public String model;
    public String color;
    public int year;
    public boolean isRunning;

    public AbstractVehicle(double maxSpeed, double currentSpeed, double weight, String brand, String model, String color, int year, boolean isRunning){
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.weight = weight;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.isRunning = isRunning;
    }

    public void start(){

    }

    public void stop(){

    }

    public String getInfo() {
        return "Brand: "+brand+" Model: "+model+" Color: "+color+" Year:"+year+" Weight: "+weight;
    }

}
