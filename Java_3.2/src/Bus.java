class Bus extends AbstractVehicle{

    public Bus(double maxSpeed, double currentSpeed, double weight,
               String brand, String model, String color, int year, boolean isRunning) {
        super(maxSpeed, currentSpeed, weight, brand, model, color, year, isRunning);
    }

    @Override
    public void start(){
        System.out.println("The bus is starting.");
    }

    @Override
    public void stop(){
        System.out.println("The bus is stopping.");
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "Type: Bus";
    }
}
