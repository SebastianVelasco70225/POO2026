public class Triangle extends Rectangle {
    private double side3;

    public Triangle (double side1, double side2, double side3, int x, int y){
        super(side1, side2, x, y);
        setSide3(side3);
    }

    public void setSide3(double side3){
        if (side3<0||side3==0){
            throw new IllegalArgumentException("El lado debe ser positivo");
        }
        this.side3=side3;
    }

    @Override 
    public void calculatePerimeter(){
        double p=getSide()+getSide2()+side3;
        setPerimeter(p);
    }   

    @Override 
    public void calculateArea(){
        double p=getPerimeter()/2;
        p=p*(p-getSide())*(p-getSide2())*(p-side3);
        double area=Math.sqrt(p);
        setArea(area);
    }

}
