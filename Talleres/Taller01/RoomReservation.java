package Talleres.Taller01;

public class RoomReservation {
    private String guestName;
    private int roomNumber;
    private int nightNumber;
    private int nightPrice;
    private int totalCost;

    public void setGuestName (String guestName){
        if(guestName!=""||guestName!=null){
            this.guestName=guestName;
        }
        else{
            System.out.println("El nombre de huésped no pudo actualizarse");
        }
    }

    public void setRoomNumber(int roomNumber){
        if (roomNumber>0){
            this.roomNumber=roomNumber;
        }
        else {
            System.out.println("Cuarto inválido");
        }
    }

    public void setNightNumber(int nightNumber){
        if (nightNumber>0){
            this.nightNumber=nightNumber;
            totalCost=this.nightNumber*nightPrice;
        }
        else{
            System.out.println("Número de noches inválido");
        }
    }

    public void setNightPrice(int nightPrice){
        if(nightPrice>0){
            this.nightPrice=nightPrice;
            totalCost=nightNumber*this.nightPrice;
        }
        else {
            System.out.println("Precio por noche inválido");
        }
    }

    public void getTotalCost(){
        System.out.println(totalCost);
    }

    public void getInfo(){
        System.out.println("Nombre del huésped: "+guestName);
        System.out.println("Número de habitación: "+roomNumber);
        System.out.println("Número de noches: "+nightNumber);
        System.out.println("Precio por noche: "+nightPrice);
        System.out.println("Costo total: "+totalCost);
    }

}
