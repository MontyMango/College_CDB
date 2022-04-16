// Kudos to Mr. LeClair for teaching me that you can add the class account to an ArrayList!

package iusb.C201.bank.transaction;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class bankTransaction
{
    private String accountDB;
    private String transactionDB;
    private ArrayList<account> accounts;
    
    public bankTransaction(String accountDB, String transactionDB)
    {
        this.accountDB = accountDB;
        this.transactionDB = transactionDB;
        accounts = new ArrayList<account>();
    }

    public void loadDB() throws IOException
    {
        // (1) Open file accountDB
        File file = new File(accountDB);

        Scanner read_file = new Scanner(file);

        // (2) Read all records.
        while(read_file.hasNext())   {
            int acc_num = read_file.nextInt();
            String first_name = read_file.next();
            String last_name = read_file.next();
            double balance = read_file.nextDouble();

            // For each record, create an object of account
            account tmp = new account(acc_num,first_name,last_name,balance);

            // add it to the ArrayList (accounts)
            this.accounts.add(tmp);
        }

        // (3) Close the file stream (Scanner)
        read_file.close();

    }

    private account searchAccount(int actNum)
    {
        account a = null;

        // (1) Search ArrayList (accounts) based on account number (actNum).
        for(int num = 0; num < accounts.size(); num++) {
            // If account is found, return the account.
            if (this.accounts.get(num).getAccountNumber() == actNum) {
                a = this.accounts.get(num);
                return a;
            }
        }
        // If account is not found return null.
        return a;
    }
  
    public void deposit()
    {
        // Your code goes here
        Scanner input = new Scanner(System.in);

        // (1) Ask the user to enter the account number and the amount to deposit.
        System.out.print("\nInput your account number: ");
        int acc_num = input.nextInt();

        System.out.print("\nInput the amount to deposit: $");
        int deposit_amount = input.nextInt();

        // (2) Call method searchAccount().
        account acc = searchAccount(acc_num);
            // If account is found in ArrayList, make the deposit.
        if(acc != null) {
            acc.deposit(deposit_amount);
        }
            // If account is not found in ArrayList, display
        else    {
            //message: "Account not found!"
        System.out.println("Account not found!");
    }

    }
    
    public void withdraw()
    {
        // Your code goes here
        Scanner input = new Scanner(System.in);

        // (1) Ask the user to enter the account number and the amount to withdraw.
        System.out.print("\nInput your account number: ");
        int input_acc_num = input.nextInt();

        System.out.print("\nInput the amount to withdraw: $");
        int input_withdraw = input.nextInt();

        // (2) Call method searchAccount().
        account acc = searchAccount(input_acc_num);

        // If account is not found in ArrayList, display message: "Account not found!"
        if(acc == null) {
            System.out.println("Account not found!");
        }
            // If account is found in ArrayList, make the withdrawal.
        else    {

            // If the withdrawal is not successful due to low balance
            if (acc.getBalance() < input_withdraw)   {
                // display message: "no enough balance!"
                System.out.println("no enough balance!");
            }
            else    {
                acc.withdraw(input_withdraw);
            }

        }

    }
    
    public void saveDB() throws IOException
    {
        //Your code goes here
        // (1) Open file accountDB for write operations.
        FileWriter file_write = new FileWriter(accountDB);

        //(2) Read all objects from ArrayList (accounts), for every object,
        for(int i = 0; i < accounts.size(); i++) {

            // retrieve account number, first name, last name, balance, and write
            account current_acc = this.accounts.get(i);

            int acc_num = current_acc.getAccountNumber();
            String first_name = current_acc.getFirstname();
            String last_name = current_acc.getLastname();
            double balance = current_acc.getBalance();

            // them in the file as one record (line)
            file_write.write(acc_num + " " + first_name + " " + last_name + " " + balance + "\n");
        }
        // (3) Close the file stream (FileWriter)
        file_write.close();

    }
}