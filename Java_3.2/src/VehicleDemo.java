public class VehicleDemo {
    public static void main(String[] args){

        Car car = new Car(200,0,1100, "Dodge","Dart", "blue",1965,false);
        Motorcycle motorcycle = new Motorcycle(320,0, 266, "Suzuki","Hayabusa","black", 2024, false);
        Bus bus = new Bus(120,0,16000,"scania","Touring","white", 2010,false);




        System.out.println(car.getInfo());
        System.out.println(motorcycle.getInfo());
        System.out.println(bus.getInfo());




        car.start();
        motorcycle.start();
        bus.start();


        bus.stop();
        motorcycle.stop();
        car.stop();

    }

}
