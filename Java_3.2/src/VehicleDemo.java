public class VehicleDemo {
    public static void main(String[] args){

        Vehicle[] vehicles = {
                new Car(200, 0, 1100, "Dodge", "Dart", "blue", 1965, false, 6.5),
                new Motorcycle(320, 0, 266, "Suzuki", "Hayabusa", "black", 2024, false, 4.2),
                new Bus(120, 0, 16000, "Scania", "Touring", "white", 2010, false, 28),
                new ElectricCar(220, 0, 1000, "Polestar", "5GT", "black", 2025, false, 100, 100, 0.2),
                new ElectricMotorcycle(300, 0, 200, "Zero", "SR/S", "red", 2025, false, 60, 80, 0.12)

        };

        System.out.println("---Vehicle info---");
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.getInfo());
        }


        System.out.println("\nStarting all vehicles...");
        for(Vehicle vehicle : vehicles){
            vehicle.start();
        }

        System.out.println("\nAccelerating vehicles...");
        vehicles[0].accelerate(45);
        vehicles[1].accelerate(85);
        vehicles[2].accelerate(25);
        vehicles[3].accelerate(60);
        vehicles[4].accelerate(100);


        System.out.println("\nShowing speed of all vehicles...");
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.getInfo()+ " | Speed: "+vehicle.getSpeed()+" km/h");
        }
    }

}
