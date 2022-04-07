package Homework6;
public class hw06
{
    public static void main(String[] args)
    {
        user u1 = new user("312-45-8910", "John", "Smith");
        user u2 = new user("312-00-8000", "Paul", "Wayfar");
        
        u1.openAccount(1001, accountType.CHECKING);
        u1.setCheckingFee(1001, 15);
        u1.openAccount(1002, accountType.SAVING);
        u1.setSavingRate(1002, 0.015);
        u1.openAccount(1003, accountType.CD);
        u1.setCDRateTerm(1003, 0.045, 5);
 
        u1.deposit(1001, 100);
        u1.deposit(1002, 500);
        u1.deposit(1003, 500);
        u1.deposit(1003, 400);
       
        u1.printCurrentBalance(1001);        
        u1.printCurrentBalance(1002);
        u1.printCurrentBalance(1003);
        
        u1.printEndMonthBalance(1001);        
        u1.printEndMonthBalance(1002);
        u1.printEndMonthBalance(1003);
        
        u1.getCDmatureBalance(1003);
    }
}

/*
A correctly implemented program should display:

current balance of Account 1001 is $100.0
current balance of Account 1002 is $500.0
current balance of Account 1003 is $900.0
This month's ending balance of Account 1001 is $85.0
This month's ending balance of Account 1002 is $500.0 plus some interest
This month's ending balance of Account 1003 is not available
The maturing balance of CD 1003 is $1121.56

*/
