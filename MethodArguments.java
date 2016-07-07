
package methodarguments;


public class MethodArguments {

    /**
     * @param args the command line arguments
     */
    static String text[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    public static void main(String[] args) {
        // TODO code application logic here
    double output=addUp(3.2, 2.2,4.4,6.2);
    System.out.println(output);
    int output1=addUp(1, 4,2,3);
    System.out.println(output1);
    int output2=addUp("one", "three","four","one");
    System.out.println(output2);
    //int err=addUp(2, 3.5);
    //int err2=addUp(1, "three");
    }
    
    public static int addUp(int... arr)
    {
        
        System.out.println("Integer Type");
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
        sum=sum+arr[i];
        }
        return sum;
    }
    public static double addUp(double... arr)
    {
        
        System.out.println("Integer Type");
        double sum=0.0;
        for(int i=0;i<arr.length;i++)
        {
        sum=sum+arr[i];
        }
        return sum;
    }
    public static int addUp(String... arr)
    {
        
        System.out.println("Integer Type");
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
         int x=toNumber(arr[i]);
         sum=sum+x;
        }
        return sum;
    }
    
    
    public static int toNumber(String s)
    {
        for(int i=0;i<text.length;i++)
        {
            if(text[i].equals(s))
                return i;
        }
        return -1;
    }
    /* LAB2 */
    /*public static int addUp(int a,int b)
    {
        System.out.println("Integer Type");
        return a+b;
    }
    public static double addUp(double a,double b)
    {
        System.out.println("Double Type");
        return a+b;
    }*/
    /*public static int addUp(String a,String b)
    {
        System.out.println("String Type");
        int x=toNumber(a);
        int y=toNumber(b);
        return x+y;
    }*/
    
    
}
