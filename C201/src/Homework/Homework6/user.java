package Homework6;
import java.util.ArrayList;

enum accountType
{
    CHECKING, SAVING, CD, MONEY_MARKET, IRA;
}

public class user
{
    private String idNumber;
    private String firstName;
    private String lastName;
    private ArrayList accounts;
    
    public user(String idNumber, String fn, String ln)
    {
        this.idNumber = idNumber;
        this.firstName = fn;
        this.lastName = ln;
        accounts = new ArrayList<account>();
    }
    
    public void openAccount(int actNum, accountType t)
    {
        account act;
        
        if(t==accountType.CHECKING) act = new checkingAccount(actNum);
        else if (t==accountType.SAVING) act = new savingAccount(actNum);
        else if (t==accountType.CD) act = new CD(actNum);
        else act=null; //other types of account are not implemented;
        
        accounts.add(act);
    }
    
    public void setCheckingFee(int actNum, double fee)
    {
        checkingAccount c = (checkingAccount)searchAccount(actNum);
        if(c!=null) c.set_fee(fee);
    }
    
    public void setSavingRate(int actNum, double rate)
    {
        savingAccount s = (savingAccount)searchAccount(actNum);
        if(s!=null) s.set_interest_rate(rate);
    }
    
    public void setCDRateTerm(int actNum, double rate, int term)
    {
        CD cd = (CD)searchAccount(actNum);
        if(cd!=null) cd.set_rate_and_term(rate, term);
    }
    
    public void closeAccount(int actNum)
    {
        account a = searchAccount(actNum);
        accounts.remove(a);
    }
    
    private account searchAccount(int actNum)
    {
        for(int i=0; i<accounts.size(); i++)
        {
            account a = (account)accounts.get(i);
            if (a.getAccountNumber() == actNum) return a;
        }
        
        return null;
    }
    
    void deposit(int actNum, double amount)
    {
        account a = searchAccount(actNum);
        if(a!=null) a.deposit(amount);
    }
    
    void withdraw(int actNum, double amount)
    {
        account a = searchAccount(actNum);
        if(a!=null) a.withdraw(amount);
    }
    
    void printCurrentBalance(int actNum)
    {
        account a = searchAccount(actNum);
        if(a!=null) a.printCurrentBalance();
    }
    
    void printEndMonthBalance(int actNum)
    {
        account a = searchAccount(actNum);
        if(a!=null) a.printEndMonthBalance();
    }
    
    void getCDmatureBalance(int actNum)
    {
        CD cd = (CD)searchAccount(actNum);
        if(cd!=null) System.out.printf("The maturing balance of CD %d%s%.2f%n", actNum, " is $", cd.mature_balance());
    }
}