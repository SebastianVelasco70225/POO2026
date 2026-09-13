package Talleres.Taller01;

public class TestRoomReservation {
        public static void main(String[] args) {
            RoomReservation roomReservation= new RoomReservation();
            roomReservation.setGuestName("Sebastián");
            roomReservation.setRoomNumber(805);
            roomReservation.setNightNumber(3);
            roomReservation.setNightPrice(20000);
            roomReservation.getInfo();
            System.out.println();
            roomReservation.setNightNumber(5);
            roomReservation.getInfo();
            System.out.println();
            roomReservation.setNightPrice(100);
            roomReservation.getInfo();
        }
}
