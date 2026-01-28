class Bus extends AbstractVehicle{

    public Bus(double maxSpeed, double currentSpeed, double weight,
               String brand, String model, String color, int year, boolean running, double fuelEfficiency) {
        super(maxSpeed, currentSpeed, weight, brand, model, color, year, running, fuelEfficiency);
    }

    @Override
    protected void onStart(){
        System.out.println("The bus is starting.");
    }

    @Override
    protected void onStop(){
        System.out.println("The bus is stopping.");
    }

    @Override
    public void accelerate(double amount){
        super.accelerate(amount);
        System.out.println("The bus "+brand+" "+model+" accelerates.");
    }
    @Override
    public void decelerate(double amount){
        super.decelerate(amount);
        System.out.println("The bus "+brand+" "+model+" decelerates.");
    }

    @Override
    public String getInfo(){
        return super.getInfo() + ", Type: Bus";
    }
}
