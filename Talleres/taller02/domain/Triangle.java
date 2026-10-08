package POO2026.Talleres.taller02.domain;
public class Triangle extends Rectangle {
    private double side3;

    public Triangle (double side1, double side2, double side3, int x, int y, int id){
        super(side1, side2, x, y, id);
        validator(side1, side2, side3);
        setSide3(side3);
        calculateArea();
        calculatePerimeter();
        setName("Triángulo");   
    }

    public void setSide3(double side3){
        if (side3<0||side3==0){
            throw new IllegalArgumentException("El lado debe ser positivo");
        }
        this.side3=side3;
    }

    public void validator(double side1, double side2, double side3){
        if((side1+side2)<side3){
            throw new IllegalArgumentException("Las medidas de los lados no corresponden a un triángulo real");
        }
    }
    @Override 
    protected void calculatePerimeter(){
        double p=getSide()+getSide2()+side3;
        setPerimeter(p);
    }   

    @Override 
    protected void calculateArea(){
        double p=getPerimeter()/2;
        p=p*(p-getSide())*(p-getSide2())*(p-side3);
        double area=Math.sqrt(p);
        setArea(area);
    }

}
