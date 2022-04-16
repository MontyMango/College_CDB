package iusb.C201.bank;

import java.sql.SQLOutput;
import java.util.Scanner;
import iusb.C201.bank.analysis.*;

public class bank
{
	private String accountDB;
	private String transactionDB;
	
	public bank(String accountDB, String transactionDB)
	{
		this.accountDB = accountDB;
		this.transactionDB = transactionDB;
	}
	
	public void accountManagement()
	{
		Scanner input = new Scanner(System.in);
		int choice;
		boolean finished = false;

		while (finished == false) {
			System.out.println("************************************");
			System.out.println("Account Management menu:");
			System.out.println("\n************************************");
			System.out.println("Please choose from the following options:");
			System.out.println("1. List all accounts");
			System.out.println("2. Add an Homework3.account");
			System.out.println("3. Delete an Homework3.account");
			System.out.println("9. Return to the hw2 menu");

			System.out.print("\nYour choice: ");
			choice = input.nextInt();

			if (choice == 1) System.out.println("to be done!");
			else if (choice == 2) System.out.println("to be done!");
			else if (choice == 3) System.out.println("to be done!");
			else if (choice == 9) finished = true;
			else System.out.println("Please enter a valid input!");
		}
		/*
		 * Your code goes here:
		 * 
		 * Use a while loop to show the following menu
		 * 
			************************************
			Account Management menu:
			************************************
			Please choose from the following options:
			1. List all accounts
			2. Add an Homework3.account
			3. Delete an Homework3.account
			9. Return to the hw2 menu
			
			Your choice:
			
			If Homework3.user picks (1), (2) or (3) show message "to be done!"
			If Homework3.user picks (9) terminate the while loop
			If Homework3.user picks other choices, show message "Please enter a valid input!"
		 */
	}
	
	public void conductTransactions()
	{
		Scanner input = new Scanner(System.in);
		int choice;
		boolean finished = false;

		while (finished == false) {
			System.out.println("\n************************************");
			System.out.println("Conduct transaction menu:");
			System.out.println("************************************");
			System.out.println("Please choose from the following options:");
			System.out.println("1. Make a deposit");
			System.out.println("2. Make a withdrawal");
			System.out.println("9. Return to the hw2 menu");

			System.out.print("\nYour choice: ");
			choice = input.nextInt();

			if (choice == 1) System.out.println("to be done!");
			else if (choice == 2) System.out.println("to be done!");
			else if (choice == 9) finished = true;
			else System.out.println("Please enter a valid input!");
		}
		/*
		 * Your code goes here:
		 * 
		 * Use a while loop to show the following menu
		 * 
			************************************
			Conduct transaction menu:
			************************************
			Please choose from the following options:
			1. Make a deposit
			2. make a withdrawal
			9. Return to the hw2 menu
			
			Your choice:
			
			If Homework3.user picks (1) or (2) show message "to be done!"
			If Homework3.user picks (9) terminate the while loop
			If Homework3.user picks other choices, show message "Please enter a valid input!"
		 */
		}

		public void analysis()
	{
		Scanner input = new Scanner(System.in);
		int choice = 0;
		boolean done = false;
		
		bankAnalysis BA = new bankAnalysis(accountDB, transactionDB);
		
		while(done == false)
		{
			System.out.println("\n************************************");
			System.out.println("Account and transaction analysis menu:");
			System.out.println("************************************");
			System.out.println("Please choose from the following options:");
			System.out.println("1. Transaction analysis");
			System.out.println("2. Account analysis");
			System.out.println("9. Return to the hw2 menu");
			
			System.out.print("\nYour choice: ");
			choice = input.nextInt();
			
			if(choice == 1) BA.transactionAnalysis();
			else if (choice == 2) BA.accountAnalysis();
			else if (choice == 9) done = true;
			else  System.out.println("Please enter a valid input!");
		}
	}
}
