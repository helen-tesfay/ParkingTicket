/* 
   The ParkedCar class stores data about a parked car. Its responsibilities are
   to know the car's make, model, color, license number, and the number of minutes parked.
   
*/

public class ParkedCar
{

   private String make;          // The car's make
   private String model;         // The car's model
   private String color;         // The car's color   
   private String licenseNumber;    // The car's license number
   private int minutesParked;    // Minutes parked

/* 

   Constructor 
   make The car's make.
   model The car's model.
   color The car's color.
   licenseNumber The car's license number.
   minutesParked The number of minutes parked.
   
*/

   public ParkedCar(String make, String model, String color,      // Constructor that passes the car's details
   String licenseNumber, int minutesParked)
   
   {
      this.make = make;
      this.model = model;
      this.color = color;
      this.licenseNumber = licenseNumber;
      this.minutesParked = minutesParked;
      
   }
   
   
   /* 
   
      setMake method
      
   */
   
   public void setMake(String make)
   {
      this.make = make;
   }
   
   /* setModel method
      
   */
   
   public void setModel(String model)
   {
      this.model = model;
   }
   
   /** 
   
   setColor method
   
   */
   
   public void setColor(String color)
   {
      this.color = color;
   }
   
   /* 
      setLicenseNumber method
      
   */
   
   public void setLicenseNumber(String licenseNumber)
   {
      this.licenseNumber = licenseNumber;
   }
   
   /* setMinutesPrked method 
      
   */
   
   public void setMinutesParked(int minutesParked)
   {
      this.minutesParked = minutesParked;
   }
   
   /*
   
   getMake method
   return The car's make.
   
   */
   
   public String getMake()
   {
      return make;
   
   }
   
   public String getModel()
   {
      return model;
   }
   
   /*
   
   getColor method
   return The car's color,
   
   */
   
   public String getColor()
   {
      return color;
      
   }
   
   /* getLicenceNumber method
   return The car's license number.
   */
   
   public String getLicenseNumber()
   {
      return licenseNumber;
   }
   
   /* getMinutesParked method
   return The number of minutes parked.
   */
   
   public int getMinutesParked()
   {
      return minutesParked;
      
   }
   
   /* toString method
      return A string stating the car's make, model, color, 
      license number, and minutes parked.
   */
   
   
   public String toString() {
   
      String str = "Make: " + make + "Model: " + model + "Color: " + color + "License Number: " + licenseNumber +
      "Minutes Parked: " + minutesParked;
      
      return str;
      
      }
   
   
   }