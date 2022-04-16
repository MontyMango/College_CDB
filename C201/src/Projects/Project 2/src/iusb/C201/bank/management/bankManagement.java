package iusb.C201.bank.management;

import java.util.Scanner;
import java.io.*;

public class bankManagement {
    private final String accountDB;

    public bankManagement(String accountDB) {
        this.accountDB = accountDB;
    }

    private boolean accountExist(int actNum) throws IOException {
        File file = new File(accountDB);
        Scanner inFile = new Scanner(file);

        boolean found = false;

        while (inFile.hasNext()) {
            int act = inFile.nextInt();
            String fn = inFile.next();
            String ln = inFile.next();
            double balance = inFile.nextDouble();

            if (act == actNum) found = true;
        }

        inFile.close();

        return found;
    }

    public void listAccounts() throws IOException {
        // Your code goes here
        // 1. Open database (file accountDB)
        File acc_file = new File(accountDB);
        Scanner myAccounts = new Scanner(acc_file);

        // 2. display all the records (accounts) in file
        while (myAccounts.hasNext()) {
            int act = myAccounts.nextInt();
            String fn = myAccounts.next();
            String ln = myAccounts.next();
            double balance = myAccounts.nextDouble();

            System.out.println(act + " " + fn + " " + ln + " " + balance + "\n");
        }

        // 3. close the stream (Scanner)
        myAccounts.close();
    }

    public void addAccount() throws IOException {
        // Your code goes here
        Scanner input = new Scanner(System.in);

        int acc_num;
        boolean acc_exists;

        // 1. Ask user to enter a new account number
        System.out.print("Please enter a new account number: ");
        acc_num = input.nextInt();

        // 2. Call method accountExist to see if this account exists
        acc_exists = accountExist(acc_num);

        // 3. If this account exists, display message "This account exists"
        if (acc_exists == true) {
            System.out.println("This account exists");
        }

        // If this account does not exist:
        else {
            String fname, lname;
            double balance = 0.0;

            // a. Ask user to enter first name, last name
            System.out.print("Enter first name: ");
            fname = input.next();

            System.out.print("Please enter last name: ");
            lname = input.next();

            // b. Open database (file accountDB)
            File file = new File(accountDB);
            FileWriter myAccounts = new FileWriter(file, false);


            // c. Write account number, first name, last name, and balance (0) to file
            myAccounts.write(acc_num + " " + fname + " " + lname + " " + balance + " ");

            // d. Close the stream (FileWriter)
            myAccounts.close();
        }
    }

    public void deleteAccount() throws IOException {
        // Your code goes here
        int acc_num;
        boolean found = false;
        Scanner input = new Scanner(System.in);

        File file = new File(accountDB);
        File temp_file = new File("temp.txt");

        Scanner read_account = new Scanner(file);
        FileWriter temp_acc_file = new FileWriter("temp.txt",false);


        // 1. Ask user to enter an account number
        System.out.print("Enter account number: ");
        acc_num = input.nextInt();

        // 2. If this account exists, delete it
        while (read_account.hasNext()) {

            int read_acc_num = read_account.nextInt();
            String fname = read_account.next();
            String lname = read_account.next();
            double balance = read_account.nextDouble();

            if (read_acc_num == acc_num)    {
                found = true;
            }
            else  {
                temp_acc_file.write(read_acc_num + " " + fname + " " + lname + " " + balance + " ");
            }
        }

        // note: you should close all input and output file streams after the operation.
        read_account.close();
        temp_acc_file.close();

        file.delete();
        temp_file.renameTo(file);


        // 3. If this account does not exist, display message "no account found"
        if (found)  {
            System.out.println("\ndeleted account");
        }
        else {
            System.out.println("\nno account found");
        }


    }
}
