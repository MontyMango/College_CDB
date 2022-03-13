package Homework3;

enum accountType
{
    CHECKING, SAVING, CD, MONEY_MARKET, IRA;
}

public class account
{
    private int acctNumber;
    private accountType type;
    private double balance;
    
    public account(int act, accountType t)
    {
        acctNumber=act;
        type = t;
        balance = 0;
    }
    
    public int getAccountNumber()
    {
        return acctNumber;
    }
    
    void deposit(double amount)
    {
        balance = balance + amount;
    }
    
    void withdraw(double amount)
    {
        if(balance >= amount) balance = balance - amount;
        else System.out.println("no enough balance");
    }
    
    double getBalance()
    {
        return balance;
    }
}