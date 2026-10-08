package POO2026.Talleres.taller02.domain;
public class Ellipse extends Circle{
    double radiusShort;
    
    public Ellipse (double radius, double radiusShort,int id, int x, int y){
        super(radius,id,x,y);
        validator(radius, radiusShort);
        setRadiusShort(radiusShort);
        calculatePerimeter();
        calculateArea();
        setName("Elipse");   
    }

    public void setRadiusShort(double radiusShort){
        if (radiusShort<0||radiusShort==0){
            throw new IllegalArgumentException("El radio pequeño debe ser positivo");
        }
        this.radiusShort=radiusShort;
    }

    public double getRadiusShort(){
        return radiusShort;
    }
    
    public void validator(double radius, double radiusShort){
        if(radius<radiusShort||radius==radiusShort){
            throw new IllegalArgumentException("Las medidas de los lados no corresponden a un triángulo real");
        }
    }

    @Override 
    protected void calculatePerimeter(){
        double p;
        double sumaTerminos = 3 * (getRadius() + radiusShort);
        double raizTermino = Math.sqrt((3 * getRadius() + radiusShort) * (getRadius() + 3 * radiusShort));
        p= Math.PI * (sumaTerminos - raizTermino);
        setPerimeter(p);
    }
    
    @Override
    protected void calculateArea(){
        double a=Math.PI*radiusShort*getRadius();
        setArea(a);
    }
}
