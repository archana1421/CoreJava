
package createexception;




public class BadMonth extends Exception{
    String message="Bad Month Exception Occurred";
    
    BadMonth(String message)
    {
        //super(message);
        System.out.println(message);
        //return;
        
            /*Scanner sc=new Scanner(System.in);
            String month="";
            int day1=0;

            System.out.println("Enter the Month");
            month=sc.nextLine();
            while(!month.equalsIgnoreCase("quit"))
            {
                System.out.println("Enter the day [0-31]");
                day1=Integer.parseInt(sc.nextLine());
                try
                {
                ce.convert(month, day1);
                }
                catch(Exception e)
                {
                    throw new BadMonth("Bad Month Exception");
                }
                System.out.println("Enter the Month");
                month=sc.nextLine();
            }*/
    }
    
}
