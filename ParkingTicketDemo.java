/* This class will simulate the ParkingTicket and associated classes
   to show the implementation of all classes.

*/

public class ParkingTicketDemo {
   public static void main(String[] args) {     // Main method
   
      PoliceOfficer patrick = new PoliceOfficer("Patrick McGregor", "CKHSJ324");     // Officer object to give the ticket
      ParkedCar honda = new ParkedCar("Honda", "CR-V", "Black", "LHT8372", 247);    // Car object and its details
      ParkingMeter meter = new ParkingMeter(15);                                    // Parking meter with the minutes purchased passed through
     
      ParkingTicket ticket = patrick.parkPatrol(honda, meter);    // A new ticket is created after the officer checks the car and meter.
      System.out.print(ticket);                                   // Print ticket details                                                   
      }
}