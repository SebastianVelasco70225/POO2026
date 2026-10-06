package POO2026.talleres.taller02.view;
import POO2026.talleres.taller02.domain.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0;
        int count=0;
        Shape [] list= new Shape[10];
        while(a!=5){
            try {
            System.out.println("Ingrese una de las opciones: ");
            System.out.println("1. Crear una nueva figura: (Cuadrado, Rectangulo, Tríangulo, Círculo, Elipse) ");
            System.out.println("2. Mostrar información de todas las fíguras almacenadas");
            System.out.println("3. Mostrar información de una figura específica");
            System.out.println("4. Calcular el área y perímetro de todas las fíguras");
            System.out.println("5. Salir");
            a=sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor, ingrese un número válido.");
                sc.nextLine(); 
            }
            if(a>5||a<1){
                System.out.println("Opción inválida");
            }
            else{
                try{
                    list=chooseOption(a,list,count);
                    if(a==1){
                        count++;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: "+e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: Índice fuera de los límites del arreglo");
                } catch (InputMismatchException e) {
                    System.out.println("Error: Entrada inválida. Por favor, ingrese un número válido.");
                    sc.nextLine();  
                }
            }
        }
    }

    public static Shape[] addShape(Shape shape, int count, Shape [] list){
        list[count]=shape;
        return list;
    }

    public static void showShapeInfo(Shape shape){
        System.out.println("Tipo de figura: "+shape.getName());
        System.out.println("Id de figura: "+shape.getId());
        System.out.println("Perimetro de la figura: "+shape.getPerimeter());
        System.out.println("Área de la fígura: "+shape.getArea());
        System.out.println("Coordenadas del centro de la fígura: "+"["+shape.getPosition()[0]+", "+shape.getPosition()[1]+"]");
    }

    public static void showAllInfo(Shape [] list,int count){
        if(count==0){
            System.out.println("La lista está vacía");
            return;
        }
        for(int i=0;i<count;i++){
            showShapeInfo(list[i]);
            System.out.println("-------------");
        }
    }

    public static void showTotalArea(Shape [] list, int count ){
        double total=0;
        for(int i=0;i<count;i++){
            total+=list[i].getArea();
        }
        System.out.println("El área total es: "+total);
    }

    public static void showTotalPerimeter(Shape [] list, int count ){
        double total=0;
        for(int i=0;i<count;i++){
            total+=list[i].getPerimeter();
        }
        System.out.println("El perimetro total es: "+total);
    }

    public static Shape [] chooseOption(int option, Shape [] list, int count){
        switch(option){
            case 1:
                list=createShape(list,count);
                count++;
                return list;
            case 2:
                showAllInfo(list,count);
                return list;
            case 3:
                Scanner sc= new Scanner(System.in);
                System.out.println("Ingrese el id de la figura que desea mostrar: ");
                int id= sc.nextInt();
                showShapeInfoById(list,count,id);
                return list;
            case 4:
                if(count==0){
                    System.out.println("La lista está vacía");
                    return list;
                }
                showTotalArea(list,count);
                showTotalPerimeter(list,count);
                return list;
            case 5:
                System.out.println("Saliendo del programa...");
                return list;
            default:
                System.out.println("Opción inválida");
                return list;
    }
    }
    public static Shape [] createShape( Shape [] list, int count){
        Scanner sc= new Scanner(System.in);
        int option=0;
        System.out.println("Ingrese el tipo de figura que desea crear: ");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Círculo");
        System.out.println("5. Elipse");
        int x=0;
        int y=0;
        option=sc.nextInt();
        if(option>5||option<1){
            System.out.println("Opción inválida");
        }
        switch(option){
            case 1:
                System.out.println("Ingrese el lado del cuadrado: ");
                double side=sc.nextDouble();
                System.out.println("Ingrese la posición en x del cuadrado: ");
                x=sc.nextInt();
                System.out.println("Ingrese la posición en y del cuadrado: ");
                y=sc.nextInt();
                Square square= new Square(side,x,y,count);
                list=addShape(square,count,list);
                return list;
            case 2:
                System.out.println("Ingrese el lado 1 del rectángulo: ");
                double side1=sc.nextDouble();
                System.out.println("Ingrese el lado 2 del rectángulo: ");
                double side2=sc.nextDouble();
                System.out.println("Ingrese la posición en x del rectángulo: ");
                x=sc.nextInt();
                System.out.println("Ingrese la posición en y del rectángulo: ");
                y=sc.nextInt();
                Rectangle rectangle= new Rectangle(side1,side2,x,y,count);
                list=addShape(rectangle,count,list);
                return list;
            case 3:
                System.out.println("Ingrese el lado 1 del triángulo: ");
                side1=sc.nextDouble();
                System.out.println("Ingrese el lado 2 del triángulo: ");
                side2=sc.nextDouble();
                System.out.println("Ingrese el lado 3 del triángulo: ");
                double side3=sc.nextDouble();
                System.out.println("Ingrese la posición en x del triángulo: ");
                x=sc.nextInt();
                System.out.println("Ingrese la posición en y del triángulo: ");
                y=sc.nextInt();
                Triangle triangle= new Triangle(side1,side2,side3,x,y,count);
                list=addShape(triangle,count,list);
                return list;
            case 4:
                //Crear un círculo
                System.out.println("Ingrese el radio del círculo: ");
                double radius=sc.nextDouble();
                System.out.println("Ingrese la posición en x del círculo: ");
                x=sc.nextInt();
                System.out.println("Ingrese la posición en y del círculo: ");
                y=sc.nextInt();
                Circle circle= new Circle(radius,x,y,count);
                list=addShape(circle,count,list);
                return list;
            case 5:
                //Crear una elipse
                System.out.println("Ingrese el eje mayor de la elipse: ");
                double majorAxis=sc.nextDouble();
                System.out.println("Ingrese el eje menor de la elipse: ");
                double minorAxis=sc.nextDouble();
                System.out.println("Ingrese la posición en x de la elipse: ");
                x=sc.nextInt();
                System.out.println("Ingrese la posición en y de la elipse: ");
                y=sc.nextInt();
                Ellipse ellipse= new Ellipse(majorAxis,minorAxis,x,y,count);
                list=addShape(ellipse,count,list);
                return list;
            default:
                System.out.println("Opción inválida");
                return list;
        }    
    }

    public static void showShapeInfoById(Shape [] list, int count, int id){
        if(count==0){
            System.out.println("La lista está vacía");
            return;
        }
        
        for(int i=0;i<count;i++){
            if(list[i].getId()==id){
                showShapeInfo(list[i]);
                return;
            }
        }
        System.out.println("No se encontró una figura con el id: "+id);
    }
}

