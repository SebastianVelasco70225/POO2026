import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Shape list []= new Shape [10];
        int a=0;
        while(a!=5){
            try {
            System.out.println("Ingrese una de las opciones: ");
            System.out.println("1. Crear una nueva figura: (Cuadrado, Rectangulo, Tríangulo, Círculo, Elipse) ");
            System.out.println("2. Mostrar información de todas las fíguras almacenadas");
            System.out.println("3. Mostrar información de una figura específica");
            System.out.println("4. Calcular el área y perímetro de todas las fíguras");
            System.out.println("5. Salir");
            int a=sc.nextInt();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public Shape [] addShape(Shape [] list, Shape shape, int count){
        list[count]=shape;
        return list;
    }

    public void showShapeInfo(Shape shape){
        System.out.println("Tipo de figura: "+shape.getName());
        System.out.println("Id de figura: "+shape.getId());
        System.out.println("Perimetro de la figura: "+shape.getPerimeter());
        System.out.println("Área de la fígura: "+shape.getArea());
        System.out.println("Coordenadas del centro de la fígura: "+shape.getPosition());
    }

    public void showAllInfo(Shape [] list,int count){
        if(count==0){
            System.out.println("La lista está vacía");
            return;
        }
        for(int i=0;i<=count;i++){
            showShapeInfo(list[i]);
            System.out.println("-------------");
        }
    }

    public void showTotalArea(Shape [] list, int count ){
        double total=0;
        if(count==0){
            System.out.println("La lista está vacía");
            return;
        }
        for(int i=0;i<=count;i++){
            total+=list[i].getArea();
        }
        System.out.println("El área total es: "+total);
    }

    public void showTotalPerimeter(Shape [] list, int count ){
        double total=0;
        if(count==0){
            System.out.println("La lista está vacía");
            return;
        }
        for(int i=0;i<=count;i++){
            total+=list[i].getPerimeter();
        }
        System.out.println("El perimetro total es: "+total);
    }
    
}
