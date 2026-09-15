package Talleres.Taller01;

public class RoomReservation {
    private String guestName;
    private int roomNumber;
    private int nightNumber;
    private int nightPrice;
    private int totalCost;

    public boolean setGuestName (String guestName){
        if(guestName!=""||guestName!=null){
            this.guestName=guestName;
            return true;
        }
        else{
             return false;
        }
    }

    public boolean setRoomNumber(int roomNumber){
        if (roomNumber>0){
            this.roomNumber=roomNumber;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean setNightNumber(int nightNumber){
        if (nightNumber>0){
            this.nightNumber=nightNumber;
            totalCost=this.nightNumber*nightPrice;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setNightPrice(int nightPrice){
        if(nightPrice>0){
            this.nightPrice=nightPrice;
            totalCost=nightNumber*this.nightPrice;
            return true;
        }
        else {
            return false;
        }
    }

    public int getTotalCost(){
        return totalCost;
    }

    public void getInfo(){
        System.out.println("Nombre del huésped: "+guestName);
        System.out.println("Número de habitación: "+roomNumber);
        System.out.println("Número de noches: "+nightNumber);
        System.out.println("Precio por noche: "+nightPrice);
        System.out.println("Costo total: "+totalCost);
    }

}
