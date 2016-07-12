
package createexception;

import java.util.Scanner;


public class CreateException {

    /**
     * @param args the command line arguments
     */
    
    public enum month{
        JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMEBER,OCTOBER,NOVEMBER,DECEMBER
    }
    int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
    
    public void convert(String str,int day) throws BadMonth,BadDay
    {
        System.out.println(str+" "+day);
        boolean mTrue=true;
        month mn=null;
        try
        {
            mn=month.valueOf(str);
        }
        
        catch(Exception e)
        {
            mTrue = false;
            try
            {
            throw new BadMonth("BadMonth Exception: Given Month is a Bad Month");
            }
            catch(Exception e2)
            {        
            
            
            }
            finally
            {
                  
            }
        }
        
        int num=0;
        for(int j=0;j<12;j++)
        {
            if(month.values()[j]==mn)
                num=j;
        }
        if(day > 1 && day <= days[num] && mTrue)
            System.out.println("Valid Month and date");
        else if(day > 1 && day <= days[num])
        {
            
        }
        else
        {
            try
            {
            throw new BadDay("BadDayException:Bad Day for given BadMonth");
            }
            catch(Exception e3)
            {
                
            }
            finally
            {
               
            }
        }
        
        
    }
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        String month="";
        int day=0;
        
        System.out.println("Enter the Month");
        month=sc.nextLine();
        while(!month.equalsIgnoreCase("quit"))
        {
            CreateException ce=new CreateException();
            System.out.println("Enter the day [0-31]");
            day=Integer.parseInt(sc.nextLine());
            ce.convert(month, day);
            
            System.out.println("Enter the Month");
            month=sc.nextLine();
        }
        
    }
    
}
