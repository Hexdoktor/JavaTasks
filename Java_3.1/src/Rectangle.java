class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        if (height > 0 && width > 0){
            return width*height;
        }else{
            System.out.println("Invalid input. Values must be > 0");
            return 0;
        }
    }

    @Override
    public String toString(){
        return getColor()+" rectangle with width "+width+" and height "+height;
    }
}
