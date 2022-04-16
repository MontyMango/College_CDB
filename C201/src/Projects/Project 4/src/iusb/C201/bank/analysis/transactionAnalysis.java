package iusb.C201.bank.analysis;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class transactionAnalysis
{
    private String transactionDB;
    private ArrayList transactions;
    
    public transactionAnalysis(String transactionDB)
    {
        // Your code goes here
        // (1). Assign transactionDB to transactionDB
        this.transactionDB = transactionDB;

        // (2). Allocate spaces for transactions, which is
        //     an ArrayList of transactionRecord
        this.transactions = new ArrayList<transactionRecord>();

    }

    public void loadDB() throws IOException
    {
        // Your code goes here
        // (1) Open file transactionDB
        File file = new File(transactionDB);

        Scanner read_file = new Scanner(file);

        // (2) Read all records.
        while (read_file.hasNext())     {

            int act = read_file.nextInt();
            char type = read_file.next().charAt(0);
            double amount = read_file.nextDouble();
            String time = read_file.next();

            // For each record, create an object of transactionRecord
            transactionRecord tR = new transactionRecord(act, type, amount, time);

            // and add it to the ArrayList (transactions)
            this.transactions.add(tR);
        }

        // (3) Close the file stream (Scanner)
        read_file.close();

    }
      
    public void listTransactions()
    {
        // Your code goes here
        Scanner input = new Scanner(System.in);

        // 1. Ask user to enter an account number
        System.out.print("Enter an account number\nAccount Number: ");
        int account_num = input.nextInt();

        // 2. Display all the transaction records of that account in the ArrayList
        for ( int i = 0 ; i < this.transactions.size() ; i++ ) {
            transactionRecord transaction = (transactionRecord) this.transactions.get(i);
            if (transaction.getActnum() == account_num) {
                System.out.println(transaction.getActnum() + " " + transaction.getType() +
                        " " + transaction.getAmount() + " " + transaction.getTime());
            }
        }

    }
    
    public void listAllTransactions()
    {
        // Your code goes here
        // Display all the transaction records in the ArrayList
        for ( int i = 0 ; i < this.transactions.size() ; i++ ) {
            // I tried the enhanced for loop, but it required an object instead of transactionRecord
            transactionRecord transaction = (transactionRecord) this.transactions.get(i);
            System.out.println(transaction.getActnum() + " " + transaction.getType() +
                    " " + transaction.getAmount() + " " + transaction.getTime());
        }
    }
}