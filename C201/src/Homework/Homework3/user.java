package Homework3;

import java.util.ArrayList;

public class user
{
    private String idNumber;
    private String firstName;
    private String lastName;
    private ArrayList <account> accounts; // every Homework3.user has a list of accounts
    
    public user(String idNumber, String fn, String ln)
    {
        // your code goes here
        idNumber = idNumber;    // assign idNumber to idNumber
        firstName = fn;        // assign fn to firstName
        lastName = ln;         // assign ln to lastName
        accounts = new ArrayList();   // iniatilize accounts as an ArrayList of Homework3.account
    }
    
    // Homework3.user opens an Homework3.account (a Homework3.user can open any number of accounts and any type of accounts)
    public void openAccount(int actNum, accountType t)
    {
        // your code goes here
        account NewAccount= new account(actNum, t);  // create an Homework3.account based on Homework3.account number and type
        this.accounts.add(NewAccount);               // add the new accout to the list
    }
    
    public void closeAccount(int actNum)
    {    
        // your code goes here
        account a = searchAccount(actNum);  // search Homework3.account based on Homework3.account number
        if(a!=null) accounts.remove(a);     // if Homework3.account found, remove it from the list
    }
    
    private account searchAccount(int actNum)
    {
        // your code goes here
        // search Homework3.account based on Homework3.account number
        // if Homework3.account number matches, return the Homework3.account
        for (account acc : accounts)   {
            if (acc.getAccountNumber() == actNum)   {
                return acc;
            }
        }
        // else return null
        return null;
    }
    
    // search an Homework3.account, if it is found, make the deposit
    void deposit(int actNum, double amount)
    {
        account a = searchAccount(actNum);
        if(a!=null) a.deposit(amount);
    }
    
    void withdraw(int actNum, double amount)
    {
        // your code goes here
        account a = searchAccount(actNum);  // search an Homework3.account, if it is found, make the withdrawl
        if(a!=null) a.withdraw(amount);
    }
    
    void printBalanceOfAnAccount(int actNum)
    {
        account a = searchAccount(actNum);
        if(a!=null)
        {
            System.out.println("Account " + actNum + " balance: " + a.getBalance());
        }
        else
        {
            System.out.println("Account " + actNum + " not found!");
        }
    }
    
    double getTotalbalance()
    {
        // your code goes here
        // return the total balance of all the accounts of this Homework3.user
        double sum = 0;
        for (account acc : this.accounts)   {
            sum += acc.getBalance();
        }
        return sum;
    }
}