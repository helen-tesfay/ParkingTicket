/*
   The PoliceOfficer class stores data about a police officer 
   for the parking ticket simulation. Its responsibilites are to
   know the officer name and badge number, examine the ParkedCar
   and ParkingMeter objects to see if time has expired, and to
   issue a ticket if appropriate.

*/

public class PoliceOfficer
{
   private String name;          // Officer's name
   private String badgeNumber;   // Badge number
   
   /*
      Constuctor
      n The officer's name.
      bn The officer's badge number.
   */
   
   public PoliceOfficer(String name, String badgeNumber)
   {
      this.name = name;
      this.badgeNumber = badgeNumber;
   }
   
   /* 
      Copy constuctor
      officer2 The PoliceOfficer object to copy.
   */
   
   public PoliceOfficer(PoliceOfficer officer2)
   {
   }
   
   /* 
      setName method
      name The officer's name.
   */
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   /* 
      setBadgeNumber method
      badgeNumber The officer's badge number.
   */
   
   public void setBadgeNumber(String badgeNumber)
   {
      this.badgeNumber = badgeNumber;
   }
   
   /* 
      getName method
      name The officer's name.
   */
   
   
   public String getName()
   {
      return name;
   }
   
   /*
      getBadgeNumber method
      return The officer's badge number.
   */
   
   public String getBadgeNumber()
   {
      return badgeNumber;
   }
   
   /* 
      The patrol method looks at the number of minutes
      a car has been parked and the number of minutes
      purchased. If the minutes parked is greater than
      the minutes purchased, a ParkingTicket object is
      retured. Otherwise the method returns null. 
      car A ParkedCar object.
      meter A ParkingMeter object.
      return A ParkingTcket object if a violation occured,
         null otherwise.
   */
   
   public ParkingTicket parkPatrol(ParkedCar car, ParkingMeter meter)
   {
   
      // Initialize variables
      int minutesParked = car.getMinutesParked();           
      int minutesPurchased = meter.getMinutesPurchased();
      
      if (minutesParked > minutesPurchased)
      {
      
         // Issue a ticket if needed
         ParkingTicket ticket = new ParkingTicket(car, this, meter);
         System.out.print("Vehicle violated the purchased parking time. Ticket Details: ");
         return ticket;
                           
         } else {
         
         // Return null otherwise
         return null;
                  
         }
                        
         } 
        
     public String toString()
     {
         String str = "Officer name : " + name + "Badge Number: " + badgeNumber;
         return str;
     }
  

}