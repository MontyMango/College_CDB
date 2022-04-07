package Homework6;
public class CD extends account
{
    private double annual_interest_rate;
    private int term;
    
    public CD(int act)
    {
        super(act);
    }
    
    public CD(int act, double interest, int term)
    {
        super(act);
        this.annual_interest_rate = interest;
        this.term = term;
    }
    
    public void set_rate_and_term(double interest, int term)
    {
        this.annual_interest_rate = interest;
        this.term = term;
    }
    
    public double mature_balance()
    {
        return this.balance*Math.pow(1+annual_interest_rate, term);
    }
    
    public void printEndMonthBalance()
    {
        // your code goes here
        // display "the ending balance of the account is not available"
        System.out.println("The ending balance of Account " + this.acctNumber + " is not available");
    }
}