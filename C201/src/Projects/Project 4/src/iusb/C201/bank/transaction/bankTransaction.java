package iusb.C201.bank.transaction;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bankTransaction
{
    private String accountDB;
    private String transactionDB;
    private ArrayList accounts;
    
    public bankTransaction(String accountDB, String transactionDB)
    {
        this.accountDB = accountDB;
        this.transactionDB = transactionDB;
        accounts = new ArrayList<account>();
    }

    public void loadDB() throws IOException
    {
        File file = new File(accountDB);
        Scanner inFile = new Scanner(file);

        while (inFile.hasNext())
        {
           int act = inFile.nextInt();
           String fn = inFile.next();
           String ln = inFile.next();
           double balance = inFile.nextDouble();
           
           account a = new account(act, fn, ln, balance);
           accounts.add(a);
        }
        inFile.close();
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
  
    public void deposit() throws IOException
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the account Number: ");
        int act = input.nextInt();
        
        System.out.print("Please enter the amount: ");
        double amount = input.nextDouble();

        account a = searchAccount(act);
        if(a!=null)
        {
            a.deposit(amount);
            // Your code goes here
            // Call method recordTransaction() to save this transaction
            recordTransaction(act,'D',amount);

        }
        else System.out.println("Account not found.");
    }
    
    public void withdraw() throws IOException
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the account Number: ");
        int act = input.nextInt();
        
        System.out.print("Please enter the amount: ");
        double amount = input.nextDouble();

        account a = searchAccount(act);
        if(a!=null)
        {
            if(a.withdraw(amount)==true)
            {
                // Your code goes here
                // Call method recordTransaction() to save this transaction
                recordTransaction(act, 'W',amount);
            }
            else
                System.out.println("no enough balance.");
        }
        else System.out.println("Account not found.");
    }
    
    public void saveDB() throws IOException
    {
        FileWriter fw = new FileWriter(accountDB);
        
        for(int i=0; i<accounts.size(); i++)
        {
            account a = (account)accounts.get(i);
            int act = a.getAccountNumber();
            String fn = a.getFirstname();
            String ln = a.getLastname();
            double balance = a.getBalance();

            fw.write(act + "\t" + fn + "\t" + ln + "\t" + balance + "\n");
        }
        fw.close();
    }
    
    void recordTransaction(int actNum, char type, double amount) throws IOException
    {
        // Your code goes here:
        // 1. Open transaction record database (transactionDB file)
        File file = new File(transactionDB);
        FileWriter File_write = new FileWriter(file,true);
        String currentTime = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

        // 2. Write the transaction (account number, transaction type, amount of money, and current time)
        //   to file (database) as one line of record
        File_write.write(actNum + " " + type + " " + amount + " " + currentTime + "\n");

        // 3. Close the file stream (FileWriter)
        File_write.close();

    }
}