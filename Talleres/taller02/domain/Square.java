package POO2026.Talleres.taller02.domain;
public class Square extends Shape{
    private double side1;
    
    public Square(double side1,int x, int y, int id) {
        setSide(side1);
        setXposition(x);
        setYposition(y);
        setId(id);
        calculateArea();
        calculatePerimeter();
        setName("Cuadrado");
    }

    public double getSide() {
        return side1;
    }

    private void setSide (double side1){
        if (side1<0||side1==0){
            throw new IllegalArgumentException("El lado debe ser positivo");
        }
        this.side1=side1;
    }

    @Override
    protected void calculatePerimeter(){
        double p=side1*4;
        setPerimeter(p);
    }
    @Override 
    protected void calculateArea(){
        double a=side1*side1;
        setArea(a);
    }
}
