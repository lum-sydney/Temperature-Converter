//Sydney Lum
//5/16/2023
//This program takes a temperature from a user in either fahrenheit or celsius and converts it to either celsius or fahrenheit.



import java.util.Scanner;

public class Temperature {

    public static void main(String [] args) {
    
      Scanner userInput = new Scanner(System.in); //Creating a new object!
      
      
      //Declaring variables that user will input
      String userYesOrNo;       //Response to convert temperature
      String userFOrC;          //Response to which temperature scale user wants to use
      double userTemperatureF;      //Input temperature from user and computer will generate a response with a conversion calculation    
      double userTemperatureC;      //Input temperature from user and computer will generate a response with a conversion calculation
      
      
      System.out.println("Would you like to convert a temperature? Please answer yes or no.");   //Output
      
      userYesOrNo = userInput.nextLine();   //Asking for user input
      
            
      if (userYesOrNo.equals("yes"))    //If the response is yes, then it asks a follow-up question.
      {
      System.out.println("Do you have a temperature in Celcius or Fahrenheit? Please type C or F.");    //Output
          
          userFOrC = userInput.nextLine();    //Asking for user input
          
          if (userFOrC.equals("F"))    //If the response is F, then it asks for a temperature to convert.
          {
          System.out.println("Please insert your temperature.");    //Output
          
          userTemperatureF = userInput.nextDouble();
          
          tempConversionF(userTemperatureF);    //Calling a method for F
          }
          
          else    //If the response is C or anything else, then it asks for a temperature to convert.
          {
          System.out.println("Please insert your temperature.");    //Output
          
          userTemperatureC = userInput.nextDouble();
          
          tempConversionC(userTemperatureC);    //Calling a method for C
          }
                
      }
      else    //If the response is no, the user has no temperature, then it thanks the user for using the program.
      {
          System.out.println("Please come back when you have a temperature. Thank you for using this program.");
      }    
      
      
 

  
  
  
    
    }
    
    public static void tempConversionF(double fahr)
    {
    double ftemp = (fahr - 32) * .56;    //Calculation to take Fahrenheit to Celsius
    System.out.println(ftemp);
    }
    
    public static void tempConversionC(double cel)
    {
    double ctemp = (cel * 1.8) + 32;    //Calculation to take Celsius to Fahrenheit
    System.out.println(ctemp);
    }
    
}