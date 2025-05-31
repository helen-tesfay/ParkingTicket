# ParkingTicket
/** 

The ParkingTicket class stores data about a parking ticket for the simulation. Its responsbilities are
to report the make, model, color, license number of the illegally parked car, to report the fine amount, and
to report the office name and badge number. 

*/

public class ParkingTicket
{

   private ParkedCar car;           // The parked car
   private ParkingMeter meter;      // The meter
   private PoliceOfficer officer;   // The police officer
   private double fine;             // The parking fine
   private int minutes;             // Minutes illegally parked
   
      // Constant variable to hold base fine.
      public final double BASE_FINE = 25.0;
      
      // Constant variable to hold the hourly fine.
      public final double HOURLY_FINE = 10.0;
      
      /* 
         Constructor
         car A ParkedCar object.
         officer A PoliceOfficer object. 
         minutes Minutes illegally parked.
    */
    
    public ParkingTicket(ParkedCar car, PoliceOfficer officer, ParkingMeter meter)
    {
    
      this.car = car;
      this.officer = officer;
      this.meter = meter;
      
    }
    
     
   /* 
      calculateFine method
      This method calculates the amount of the parking fine.
      
   */
   
   // Fine Calculation
   private double calculateFine()
   {
      int minutes = (car.getMinutesParked() - meter.getMinutesPurchased());
      
      if (minutes > 0)  
      {
         if (minutes <= 60)      // Code to execute if the vehicle is parked for one hour or less
         {
         
         fine = BASE_FINE;
         
         } 
         
         else 
         
         {
         
         fine = BASE_FINE + (HOURLY_FINE * (minutes/60));      // This would charge the ower 10 dollars for each additional hour
         
         }
       
      }
      
             
      else 
      {
      
         System.out.println("No violation detected.");      // Print statement for when the minutesParked is less than the minutesPurchased
         
      }
      
     return fine;    // Return appropriate fine
   
   }
 
 
     
   /* getFine method
      return The amount of the fine.
   
   */
   
   public double getFine()
   {
      return fine;
   }
   
   /* getOfficer method
      return A copy of this object's officer field.
   */
   
   public PoliceOfficer getOfficer()
   {
      return officer;
   }
   
   /* toString method
      return A string that prints data about the car, the
         police offier, and the parking violation.
   
  */
  
   public String toString()
   {
    
    String str = "\nMake: " + car.getMake() + 
                  "\nModel: " + car.getModel() + 
                  "\nColor: " + car.getColor() + 
                  "\nLicense Plate Number: " + car.getLicenseNumber() +
                  "\nFine Amount: $" + calculateFine() +
                  "\nOfficer Name: " + officer.getName() +
                  "\nOfficer Badge Number: " + officer.getBadgeNumber();
      
   return str;
   

   }
}   

