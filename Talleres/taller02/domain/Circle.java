package POO2026.Talleres.taller02.domain;
public class Circle extends Shape {
    
    private double radius;
    public Circle(double radius, int id, int x, int y){
        setRadius(radius);
        setId(id);
        setXposition(x);
        setYposition(y);
        calculatePerimeter();
        calculateArea();
        setName("Círculo");
    }

    public void setRadius(double radius){
        if(radius<0||radius==0){
            throw new IllegalArgumentException("El radio debe ser positivo");
        }
        this.radius=radius;
    }
    
    public double getRadius (){
        return radius;
    }
    @Override
    protected void calculatePerimeter(){
        double p=2*Math.PI*radius;
        setPerimeter(p);
    }
    @Override
    protected void calculateArea(){
        double a=Math.PI*radius*radius;
        setArea(a);
    }
    
}
