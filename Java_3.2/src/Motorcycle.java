class Motorcycle extends AbstractVehicle{

    public Motorcycle(double maxSpeed, double currentSpeed, double weight,
                      String brand, String model, String color, int year, boolean isRunning){
        super(maxSpeed, currentSpeed,weight,brand,model,color,year,isRunning);
    }

    @Override
    public void start(){
        System.out.println("The motorcycle is starting.");
    }

    @Override
    public void stop(){
        System.out.println("The motorcycle is stopping.");
    }

    @Override
    public String getInfo(){
        return "Suzuki Hayabusa 1300cm3";
    }
}
