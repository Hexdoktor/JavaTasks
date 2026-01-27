public class SportsCar extends Car {
    private String typeName;
    private double gasolineLevel;
    private double speed;
    private double maxSpeed;
    private double tankCapacity;

    public SportsCar(String typeName, double gasolineLevel, double speed, double maxSpeed, double tankCapacity) {
        super(typeName,gasolineLevel,speed,maxSpeed,tankCapacity);
    }

    public void accelerate(){
        {
            if (this.gasolineLevel > 0) {
                speed += 20;
                gasolineLevel -= 2;
            } else {
                speed = 0;
            }
        }
    }

    public void decelerate(int amount){
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount * 2);
            }
        } else {
            speed = 0;
        }
    }

}