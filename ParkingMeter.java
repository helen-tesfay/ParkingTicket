/** The ParkingMeter class stores data about a parking meter for the Parking Ticket simulation. 
Its responsibilities are to know the number of minutes purchased for the car.

*/

public class ParkingMeter
{
      public static int minutesPurchased;    // Minutes purchased
   
   /*
      Constructor
      minutesPurchased The number of minutes purchased.
      
   */
   
      public ParkingMeter(int minutesPurchased)
      {
      }
   
   /* 
      setMinutesPurchased method 
      minutesPurchased The number of minutes purchased.
   
   */
   
      public void setMinutesPurchased(int minutesPurchased)
      {
         this.minutesPurchased = minutesPurchased;
      }
   
   /* 
   
      getMinutesPurchased method
      return The number of minutes purchased.
      
  */
  
      public int getMinutesPurchased()
  
      {
            return minutesPurchased;
      }
  
  }