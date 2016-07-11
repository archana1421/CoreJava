
package banking;


public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account arr[]=new Account[3];
        arr[0]=new MortgageAccount("PersonA",100000);
        arr[1]=new CheckingAccount("PersonB",200);
        arr[2]=new CheckingAccount("PersonC",1000);
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i].deposit(1000);
            arr[i].withdraw(500);
            arr[i].withdraw(1000);
            arr[i].withdraw(2000);
            
        }
    }
    
}
