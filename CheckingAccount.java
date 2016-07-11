/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author ARMANCHI
 */
public class CheckingAccount extends Account {
    long overdraft;
    long bal;
    
    CheckingAccount(String name,long overdraft1)
    {
        super(name);
       
        overdraft=overdraft1;
        
        
    }

    
    public boolean deposit(long amount) {
       
//To change body of generated methods, choose Tools | Templates.
    
    super.transaction("Checking Deposit", amount);
    return true;
            

    }

    
    public boolean withdraw(long amount) {
       
         bal = super.getBalance();
          //System.out.println("bal:"+bal);
     //To change body of generated methods, choose Tools | Templates.
     if(bal < amount)
    {
        if(amount-bal > overdraft )
            return false;
        
    }
    amount=amount*-1;
    
    super.transaction("Checking Withdrawl", amount);
    return true;
     
       
    }
    
    
}
