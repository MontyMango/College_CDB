package Homework1;
public class account
{
    private int acctNumber;
    private String firstName;
    private String lastName;
    private double balance;
    
    public account(int act)
    {
        acctNumber=act;
        firstName = "";
        lastName = "";
        balance = 0;
    }
    
    public account(int act, String f, String  l)
    {
        // constructor, your code goes here
        this.acctNumber = act;
        this.firstName = f;
        this.lastName = l;
        this.balance = 0;
    }
    
    void deposit(double amount)
    {
        // deposit, your code goes here
        if(amount >= 0) this.balance+=amount;
    }
    
    void withdraw(double amount)
    {
        if(balance >= amount) balance = balance - amount;
        else System.out.println("no enough balance");
    }
    
    void printBalance()
    {
        System.out.println("available balance is $" + balance);
    }
    
}