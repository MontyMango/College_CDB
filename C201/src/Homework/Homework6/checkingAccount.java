package Homework6;
public class checkingAccount extends account
{
    private double monthly_fee;
    
    public checkingAccount(int act)
    {
        super(act);
    }
    
    public checkingAccount(int act, double fee)
    {
        super(act);
        this.monthly_fee = fee;
    }
    
    public void set_fee(double fee)
    {
        this.monthly_fee = fee;
    }
    
    public double get_fee(double fee)
    {
        return this.monthly_fee;
    }
    
    public void printEndMonthBalance()
    {
        // your code goes here
        // display the ending balance of the account in this month which is current balance minus monthly_fee;
        System.out.println("The ending balance of Account " + acctNumber + " is $" + (this.balance-this.monthly_fee));
    }
}
