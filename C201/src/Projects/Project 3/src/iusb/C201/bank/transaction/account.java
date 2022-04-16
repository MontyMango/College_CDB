package iusb.C201.bank.transaction;

public class account
{
    private int acctNumber;
    private String firstname;
    private String lastname;
    private double balance;
    
    public account(int act, String fn, String ln, double b)
    {
        acctNumber = act;
        firstname = fn;
        lastname = ln;
        balance = b;
    }
    
    public int getAccountNumber()
    {
        return acctNumber;
    }
    
    public String getFirstname()
    {
        return firstname;
    }
    
    public String getLastname()
    {
        return lastname;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void deposit(double amount)
    {
        // Update balance (add amount to balance)
        this.balance += amount;
    }
    
    public boolean withdraw(double amount)
    {
        // If amount is less than balance, update
        if(amount < this.balance) {

            // balance (subtract amount from balance) and return true
            this.balance-=amount;
            return true;
        }

        //Else return false
        else    {
            return false;
        }
    }
}