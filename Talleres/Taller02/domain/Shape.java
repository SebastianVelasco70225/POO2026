public abstract class Shape {
    private double perimeter;
    private double area;
    private int x;
    private int y;

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
    protected abstract void calculatePerimeter();
    protected abstract void calculateArea();
}
