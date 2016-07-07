
package weather;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Weather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable{
        // TODO code application logic here
        
    BufferedReader br = Files.newBufferedReader(
    Paths.get("weather.csvx"));
    Reading[] readings = new Reading[12];
    String line;
    for (int i = 0; i < readings.length; i++) {
        readings[i] = new Reading(br.readLine());
        System.out.println(readings[i].getTime()+" was "+readings[i].rateTemperature());
    }
    // remaining code here
    
    
    }
    
}
