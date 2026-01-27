class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height, String color){
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        if(base > 0 && height > 0){
            return 0.5*base*height;
        }else{
            System.out.println("Invalid input. Values must be > 0");
            return 0;
        }
    }

    @Override
    public String toString(){
        return getColor()+" triangle with base "+base+" and heigth "+height;
    }
}

