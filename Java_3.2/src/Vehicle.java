public interface Vehicle {
    void start();
    void stop();
    void accelerate(double amount);
    void decelerate(double amount);
    String getInfo();
    double getSpeed();
    double calculateFuelEfficiency();

}
