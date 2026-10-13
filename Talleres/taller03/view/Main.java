package Talleres.taller03.view;
import Talleres.taller03.domain.*;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TransportService [] list= new TransportService[10];
        int option=0;
        int count=0;
        while(option!=5){
            try{
            System.out.println("Ingrese una de las opciones: ");
            space();
            System.out.println("1. Crear un nuevo servicio de transporte (Taxi, Bus, Train, Airplane o Boat) y almacenarlo en la colección.");
            space();
            System.out.println("2. Mostrar todos los servicios almacenados, junto con su id, tipo, información correspondiente y tarifa calculada.");
            space();
            System.out.println("3. Consultar y mostrar la información de un servicio específico a partir de su id");
            space();
            System.out.println("4. Calcular y mostrar el valor total de las tarifas de todos los servicios almacenados.");
            space();
            System.out.println("5. Salir del programa.");
            option=sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Entrada inválida porfavor ingresa un número válido");
            sc.nextLine();
        } 
        if(option>5||option<1){
            System.out.println("Opción inválida");
        }
        else {
            try{
                list=chooseOption(option,list,count);
                if(option==1){
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
    
    public static void space () {
        System.out.println("------------------------------");
    }

    public static TransportService[] chooseOption(int option, TransportService[] list, int count){
        Scanner sc= new Scanner(System.in);
        switch(option){
            case 1: 
                list=newTransportService(list, count);
                return list;
            case 2:
                showAllInfo(list, count);
                return list;
            case 3:
                System.out.println("Ingrese el id del transporte:");
                int id=sc.nextInt();
                showTransportInfo(id, list,count);
                return list;
            case 4:
                calculateTotalPrices(count, list);
                return list;
            case 5:
                System.out.println("Saliendo del programa.....");
                return list;
            default:
                return list;
        }
    }
    public static TransportService[] addTransportServices(TransportService[] list, int count, TransportService transport){
        list[count]=transport;
        return list;
    }
    public static TransportService[] newTransportService(TransportService[] list, int count){
        Scanner sc= new Scanner(System.in);
        System.out.println("Escoge el transporte que deseas crear");
        space();
        System.out.println("1. Bus");
        System.out.println("2. Taxi");
        System.out.println("3. Tren");
        System.out.println("4. Avión");
        System.out.println("5. Bote");
        int option=sc.nextInt();
        if (option>5||option<1){
            System.out.println("Opción inválida");
            return list;
        }
        else{
            switch (option) {
                case 1:
                    System.out.println("Ingresa la tarifa base del bus");
                    double price=sc.nextDouble();
                    Bus bus= new Bus(price,count);
                    list=addTransportServices(list, count, bus);
                    System.out.println("Se ha añadido correctamente el transporte con id: "+bus.getId());
                    return list;
                case 2:
                    System.out.println("Ingresa la tarifa base del taxi");
                    double basePrice=sc.nextDouble();
                    System.out.println("Ingresa la tarifa por kilómetro recorrido del taxi");
                    double kilometerPrice=sc.nextDouble();
                    System.out.println("Ingresa los kilómetros recorridos de el taxi");
                    int kilometers=sc.nextInt();
                    Taxi taxi= new Taxi (basePrice, count, kilometerPrice, kilometers);
                    list=addTransportServices(list, count, taxi);
                    System.out.println("Se ha añadido correctamente el transporte con id: "+taxi.getId());
                    return list;
                case 3:
                    System.out.println("Ingresa el cargo por el servicio ferroviario");
                    double ferroPrice=sc.nextDouble();
                    System.out.println("Ingresa la tarifa por kilómetro recorrido");
                    kilometerPrice=sc.nextDouble();
                    System.out.println("Ingresa los kilómetros recorridos");
                    kilometers=sc.nextInt();
                    Train train= new Train(kilometerPrice, ferroPrice, count, kilometers);
                    list=addTransportServices(list, count, train);
                    System.out.println("Se ha añadido correctamente el transporte con id: "+train.getId());
                    return list;
                case 4:
                    System.out.println("Ingresa la tarifa base del avión");
                    basePrice=sc.nextDouble();
                    System.out.println("Ingresa la tarifa por kilogramo de equipaje");
                    double kilogramPrice=sc.nextDouble();
                    System.out.println("Ingresa los kilógramos de equipaje cargados");
                    int kilograms=sc.nextInt();
                    Airplane airplane= new Airplane(basePrice, count, kilogramPrice, kilograms);
                    list=addTransportServices(list, count, airplane);
                    return list;
                case 5:    
                    System.out.println("Ingresa la tarifa base del barco");
                    basePrice=sc.nextDouble();
                    System.out.println("Ingresa la tarifa por kilómetro recorrido");
                    kilometerPrice=sc.nextDouble();
                    System.out.println("Ingresa los kilómetros recorridos");
                    kilometers=sc.nextInt();
                    System.out.println("Ingresa el cargo fijo de embarque");
                    double embarguePrice=sc.nextDouble();
                    Boat boat= new Boat(basePrice, kilometerPrice, count, embarguePrice, kilometers);
                    list=addTransportServices(list, count, boat);
                    return list;
                default:
                    return list;
            }
        }
    }

    public static void showAllInfo(TransportService[]list,int count){
        if(count==0){
            System.out.println("La lista está vacía");
            return;
        }
        for (int i=0;i<count;i++){
            TransportService transport=list[i];
            String[] info=transport.allInfo();
            for (int j=0;j<info.length;j++){
                System.out.println(info[j]);
                System.out.println();
            }
            space();
        }
    }

    public static void showTransportInfo(int id,TransportService[]list,int count){
        if (id<count&&id>-1){
            TransportService transport= list[id];
            String [] info=transport.allInfo();
            for(int i=0;i<info.length;i++){
                System.out.println(info[i]);
                System.out.println();
            }
            return;
        } 
        System.out.println("No se encontró un transporte con el id: "+id);
    }

    public static void calculateTotalPrices(int count, TransportService[]list){
        if(count==0){
            System.out.println("La lista está vacía");
            return;
        }
        double totalPrice=0;
        for (int i=0;i<count;i++){
            TransportService transport=list[i];
            System.out.println("Transporte de tipo: "+transport.getName());
            System.out.println();
            System.out.println("Tarifa total de: "+transport.getPrice());
            totalPrice+=transport.getPrice();
            space();
        }
        System.out.println("El precio acumulado de todos los transportes es: "+totalPrice);
    }
}
