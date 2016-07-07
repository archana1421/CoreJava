
package weather;

public class Reading {
    
    String day;
    int hour;
    int temperature;
    int windspeed;
    enum tempType{cold,mild,hot,warm};
    enum timeType{
        
        Mm("Monday morning"),Ta("Tuesdayafternoon"),Te("Thursday evening");
        private final String displayName;
        timeType(final String display)
        {
            this.displayName = display;
        }
 
        @Override public String toString()
        {
            return this.displayName;
        }
    };
    
    Reading(String input)
    {
        String input_data[] = input.split(", ");
        day=input_data[0];
        hour=Integer.parseInt(input_data[1]);
        temperature=Integer.parseInt(input_data[2]);
        windspeed=Integer.parseInt(input_data[3]);
    }
    tempType rateTemperature()
    {
        if(temperature < 55)
            return tempType.cold;
        else if(temperature < 65)
            return tempType.mild;
        else if(temperature < 80)
            return tempType.warm;
        else
            return tempType.hot;
    }
    timeType getTime()
    {
        if(hour==9)
        {
            return timeType.Mm;
        }
        else if(hour==12)
        {
            return timeType.Ta;
        }
        else
        {
            return timeType.Te;
        }
    }
    
    
}
