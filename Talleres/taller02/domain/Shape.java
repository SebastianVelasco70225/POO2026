package POO2026.Talleres.taller02.domain;
public abstract class Shape {
    private double perimeter;
    private double area;
    private int x;
    private int y;
    private int id;
    private String name;
    public void setPerimeter(double perimeter){
        this.perimeter=perimeter;
    }
    public void setArea(double area){
        this.area=area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public double getArea (){
        return area;
    }

    public void setXposition (int x){
        this.x=x;
    }

    public void setYposition (int y){
        this.y=y;
    }

    public int[] getPosition(){
       int [] position={x,y};
       return position;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    protected abstract void calculatePerimeter();
    protected abstract void calculateArea();

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
