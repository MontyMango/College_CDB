package Homework3;

public class hw03
{
    public static void main(String[] args)
    {
        user u1 = new user("312-45-8910", "John", "Smith");
        user u2 = new user("312-00-8000", "Paul", "Wayfar");
        
        u1.openAccount(1001, accountType.CHECKING);
        u1.openAccount(1002, accountType.SAVING);
        u1.openAccount(1003, accountType.CD);

        u2.openAccount(2001, accountType.CHECKING);
        u2.openAccount(2002, accountType.CHECKING);
        
        u1.deposit(1001, 100);
        u1.deposit(1002, 500);
        u1.deposit(1003, 500);
        u1.deposit(1003, 400);

        u2.deposit(2001, 999); 
        u2.deposit(2002, 888.88);
        u2.withdraw(2001, 999);  
        u2.closeAccount(2001);
        
        u1.printBalanceOfAnAccount(1003);        
        u2.printBalanceOfAnAccount(2001);
        u2.printBalanceOfAnAccount(2002);
        
        System.out.println("Total balance of User 1: " + u1.getTotalbalance());
        System.out.println("Total balance of User 2: " + u2.getTotalbalance());
    }
}

/*
A successfully implemented program should dispaly:

Account 1003 balance: 900.0
Account 2001 not found!
Account 2002 balance: 888.88
Total balance of User 1: 1500.0
Total balance of User 2: 888.88

*/