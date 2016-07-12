
package createexception;


public class BadDay extends Exception{
    String message="Bad Day Exception occurred: Specified Day does not exist in Specified Month";
    
    BadDay(String message)
    {
       System.out.println(message);
       
    }
}
