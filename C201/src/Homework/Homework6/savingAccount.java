package Homework6;
public class savingAccount extends account
{
    private double annual_interest_rate;
    
    public savingAccount(int act)
    {
        super(act);
    }
    
    public savingAccount(int act, double interest)
    {
        super(act);
        this.annual_interest_rate = interest;
    }
    
    public void set_interest_rate(double interest)
    {
        this.annual_interest_rate = interest;
    }
    
    public double get_interest_rate(double interest)
    {
        return this.annual_interest_rate;
    }
    
    public void printEndMonthBalance()
    {
        // your code goes here
        // display the ending balance of the account in this month which is current balance "plus some interest"
        // you do not need to calculate monthly interest. Just show the message;
        System.out.println("The ending balance of Account " + acctNumber + " is $" + balance + " plus some interest");
    }
}