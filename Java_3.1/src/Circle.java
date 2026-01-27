class Circle extends Shape{
    private double radius;

    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        if (radius > 0){
            return Math.PI * (radius * radius);
        }else{
            System.out.println("Invalid input for radius. Must be > 0");
            return 0;
        }
    }

    @Override
    public String toString(){
        return getColor()+" circle with radius " + radius;
    }
}