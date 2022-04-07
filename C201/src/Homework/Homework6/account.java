package Homework6;
public abstract class account
{
    protected int acctNumber;
    protected double balance;
    
    public account(int act)
    {
        acctNumber=act;
        balance = 0;
    }
    
    public int getAccountNumber()
    {
        return acctNumber;
    }
    
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    
    public void withdraw(double amount)
    {
        if(balance >= amount) balance = balance - amount;
        else System.out.println("no enough balance");
    }
    
    public void printCurrentBalance()
    {
        System.out.println("current balance of Account " + acctNumber + " is $" + balance);
    }

    // your code goes here, declare an abstract method void printEndMonthBalance()
    public abstract void printEndMonthBalance();
}