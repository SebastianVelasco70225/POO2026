public class Rectangle extends Square {
    private double side2;

    public Rectangle(double side1, double side2, int x, int y){
        super(side1,x,y);
        setSide2(side2);
    }

    public double getSide2(){
        return side2;
    }
    public void setSide2(double side2) {
        if (side2<0||side2==0){
            throw new IllegalArgumentException("El lado debe ser positivo");
        }
        this.side2=side2;
    }

    @Override 
    public void calculatePerimeter(){
        double p=(getSide()*2)+(side2*2);
        setPerimeter(p);
    }
    @Override 
    public void calculateArea(){
        double a=getSide()*side2;
        setArea(a);
    }
    
}
