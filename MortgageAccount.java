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
public class MortgageAccount extends Account{

    long loan;
    long bal;
    MortgageAccount(String name,long loan1)
    {
        super(name);
        bal = super.getBalance();
       loan=loan1;
        
        
    }
    @Override
    public boolean deposit(long amount) {
        //To change body of generated methods, choose Tools | Templates.
        super.transaction("Mortgage Payment", amount);
        return true;
    }

    @Override
    public boolean withdraw(long amount) {
       //To change body of generated methods, choose Tools | Templates.
       return false;
    }
    
}
