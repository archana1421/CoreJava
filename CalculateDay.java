import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CalculateDay{

     public static void main(String []args)throws IOException{
        
        int date = 0;
		String daygiven="";
        int year = 0;
        int monthValue = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		System.out.println("Enter Date:");
		daygiven=br.readLine();
        
        while(!daygiven.equals("quit")){
			try{
            date = Integer.parseInt(daygiven);
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
         System.out.println("Enter Month");
        String monthStr = br.readLine();
        try{
            monthValue = Integer.parseInt(monthStr);
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
        String month = "";
        
        
        System.out.println("Enter year");
        try{
            year = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
		if(monthValue == 1){
            month = "january";
			monthValue=monthValue+12;
			year=year-1;
        }
        else if(monthValue == 2){
            month = "february";
			monthValue=monthValue+12;
			year=year-1;
        }
        else if(monthValue == 3){
            month = "march";
        }
        else if(monthValue == 4){
            month = "april";
        }
        else if(monthValue == 5){
            month = "may";
        }
        else if(monthValue == 6){
            month = "june";
        }
        else if(monthValue == 7){
            month = "july";
        }
        else if(monthValue == 8){
            month = "august";
        }
        else if(monthValue == 9){
            month = "september";
        }
        else if(monthValue == 10){
            month = "october";
        }
        else if(monthValue == 11){
            month = "november";
        }
        else if(monthValue == 12){
            month = "december";
        }
        else{
            return;
        }
        int h = (date + (int)((13 * (monthValue + 1)) / 5.0) + year +(int)(year / 4.0) + 6 * (int)(year / 100.0) +(int)(year / 400.0))% 7;
        if(h == 0){
            System.out.println(month+" "+date+","+year+"("+"Saturday)");
        }
        if(h == 1){
            System.out.println(month+" "+date+","+year+"("+"Sunday)");
        }
        if(h == 2){
            System.out.println(month+" "+date+","+year+"("+"Monday)");
        }
        if(h == 3){
            System.out.println(month+" "+date+","+year+"("+"Tuesday)");
        }
        if(h == 4){
            System.out.println(month+" "+date+","+year+"("+"Wednesday)");
        }
        if(h == 5){
            System.out.println(month+" "+date+","+year+"("+"Thursday)");
        }
        if(h == 6){
            System.out.println(month+" "+date+","+year+"("+"Friday)");
        }
        System.out.println("Enter Date");
        daygiven = br.readLine();
        }
     }
}
