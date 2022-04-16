package iusb.C201.bank.analysis;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class bankAnalysis
{
	private String accountDB;
	private String transactionDB;
	
	public bankAnalysis(String accountDB, String transactionDB)
	{
		this.accountDB = accountDB;
		this.transactionDB = transactionDB;
	}
	
	public void transactionAnalysis()
	{
		Scanner input = new Scanner(System.in);
		int choice;
		boolean finished = false;

		while(finished == false)	{
			System.out.println("************************************");
			System.out.println("Transaction Analysis menu:");
			System.out.println("************************************");
			System.out.println("Please choose from the following options:");
			System.out.println("1. List all transactions");
			System.out.println("2. List transactions of one Homework3.account");
			System.out.println("9. Return to the parent menu");

			System.out.print("\nYour Choice: ");
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
			Transaction Analysis menu:
			************************************
			Please choose from the following options:
			1. List all transactions
			2. List transactions of one Homework3.account
			9. Return to the parent menu
			
			Your choice: 
			
			If Homework3.user picks (1) or (2) show message "to be done!"
			If Homework3.user picks (9) terminate the while loop
			If Homework3.user picks other choices, show message "Please enter a valid input!"
		 */
	}
	
	public void accountAnalysis()
	{
		Scanner input = new Scanner(System.in);
		int choice;
		boolean finished = false;

		while(finished == false)	{
			System.out.println("************************************");
			System.out.println("Account Analysis menu:");
			System.out.println("************************************");
			System.out.println("Please choose from the following options:");
			System.out.println("1. Search an Homework3.account");
			System.out.println("2. List accounts in increasing Homework.Lab5.order of Homework3.account number");
			System.out.println("3. List accounts in decreasing Homework.Lab5.order of balance");
			System.out.println("9. Return to the parent menu");

			System.out.print("\nYour Choice: ");
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
			Account Analysis menu:
			************************************
			Please choose from the following options:
			1. Search an Homework3.account
            2. List accounts in increasing Homework.Lab5.order of Homework3.account number
			3. List accounts in decreasing Homework.Lab5.order of balance
			9. Return to the parent menu
			
			Your choice: 
			
			If Homework3.user picks (1), (2), or (3) show message "to be done!"
			If Homework3.user picks (9) terminate the while loop
			If Homework3.user picks other choices, show message "Please enter a valid input!"
		 */
	}
}
