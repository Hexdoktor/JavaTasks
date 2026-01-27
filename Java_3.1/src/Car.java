public class Car {

    private double speed;
    private double maxSpeed;
    private double gasolineLevel;
    private final double tankCapacity;
    private final String typeName;
    private boolean cruiseControlOn = false;
    private double targetSpeed;

    //default constructor
    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        tankCapacity = 100;
        maxSpeed = 160;
        this.typeName = typeName;
    }

    //custom constructor
    public Car(String typeName, double gasolineLevel, double speed, double maxSpeed, double tankCapacity) {
        this.typeName = typeName;
        this.gasolineLevel = gasolineLevel;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.tankCapacity = tankCapacity;
    }

    void fillTank() {
        gasolineLevel = tankCapacity;
    }

    //speed up and lose fuel
    void accelerate() {
        if (gasolineLevel > 0) {
            speed += 5;
            gasolineLevel -= 1;
        } else {
            speed = 0;
        }
    }

    //slow down or stop entirely
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount);
            }
        } else {
            speed = 0;
        }
    }

    // check for viability and accelerate or decelerate accordingly
    void updateCruiseControl() {
        if (cruiseControlOn) {
            System.out.println(this.getTypeName() + ": speed is " + this.getSpeed() + " km/h");
            if (gasolineLevel <= 0) {
                turnCruiseControlOff();
            }
            if (this.speed < targetSpeed && targetSpeed <= maxSpeed && gasolineLevel > 0) {
                if (speed + 5 > maxSpeed) {
                    speed = maxSpeed;
                } else accelerate();
            } else if (this.speed > targetSpeed) {
                if (speed - 5 < targetSpeed) {
                    speed = targetSpeed;
                } else {
                    decelerate(5);
                }
            } else if (targetSpeed > maxSpeed) {
                turnCruiseControlOff();
            }
            gasolineLevel -= 1;
        }
    }

    //set boolean true and inform driver when activated or unable to function
    void turnCruiseControlOn() {
        if (targetSpeed >= 60 && targetSpeed <= 120 && gasolineLevel > 0 && targetSpeed <= maxSpeed) {
            this.cruiseControlOn = true;
            System.out.println("Cruise control activated.");
        } else {
            System.out.println("Unable to activate cruise control.");
        }
    }

    //set boolean false and inform driver of deactivation
    void turnCruiseControlOff() {
        this.cruiseControlOn = false;
        System.out.println("Cruise control deactivated.");
    }

    //set target speed for cruise if valid and inform driver if successful or not
    void setTargetSpeed(double targetSpeed) {
        if (targetSpeed >= 60 && targetSpeed <= 120 && targetSpeed <= maxSpeed) {
            this.targetSpeed = targetSpeed;
            System.out.println("Target speed set to " + this.targetSpeed + " km/h");
        } else {
            System.out.println("Target speed out of range (60 - 120 km/h).");
        }
        ;
    }


    //getters----
    String getTargetSpeedInfo() {
        return "Target speed is " + this.targetSpeed + " km/h";
    }

    String getTypeName() {
        return typeName;
    }

    String getCruiseControlInfo() {
        if (cruiseControlOn) {
            return "Cruise control is on. Target speed set to " + this.targetSpeed + " km/h";
        } else {
            return "Cruise control is off.";
        }
    }

    boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    double getTargetSpeed() {
        return targetSpeed;
    }

    double getSpeed() {
        return speed;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }
}
