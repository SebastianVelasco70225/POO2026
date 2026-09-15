package Talleres.Taller01;

public class TestRoomReservation {
        public static void main(String[] args) {
            RoomReservation roomReservation= new RoomReservation();
            boolean valid=roomReservation.setGuestName("Sebastián");
            comprobation(valid);
            valid=roomReservation.setRoomNumber(805);
            comprobation(valid);
            valid=roomReservation.setNightNumber(3);
            comprobation(valid);
            valid=roomReservation.setNightPrice(20000);
            comprobation(valid);
            roomReservation.getInfo();
            System.out.println();
            valid=roomReservation.setNightNumber(5);
            comprobation(valid);
            roomReservation.getInfo();
            System.out.println();
            valid=roomReservation.setNightPrice(100);
            comprobation(valid);
            roomReservation.getInfo();
        }

        public static comprobation(boolean valid){
                if(valid){
                        System.out.println("Información actualizada con éxito");
                }
                else{
                        System.out.println("Valor inválido ingresado");
                }
        }
}
