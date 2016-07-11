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
public abstract class Account {
    private long balance;
    private String holderName;
    Account(String name)
    {
        holderName=name;
    }
    public final void transaction(String message,long amount)
    {
        System.out.println("Account Holder Name:"+this.holderName+"\nTransactionMessage: "+message+"\nAmount: "+amount);
        balance=balance+amount;
        
    }
    public long getBalance()
    {
        return balance;
    }
    public abstract boolean deposit(long amount);
    
    public abstract boolean withdraw(long amount);
}
