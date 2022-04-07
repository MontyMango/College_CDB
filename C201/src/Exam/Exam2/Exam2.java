public class Exam2
{
    public static void main(String[] args)
    {
        Worker w1 = new Worker(1001, "John", "Smith", 1200);
        Worker w2 = new Worker(1002, "Sam", "Goah", 1000);
        Worker w3 = new Worker(1003, "Doug", "Frank", 500);
        Manager m1 = new Manager(201, "Pam", "Hulo", 36000);
        Manager m2 = new Manager(202, "Lucy", "Buffett", 45000);
        Manager m3 = new Manager(99, "Paul", "Won", 72000);
        
        m1.addSupervisee(w1);
        m1.addSupervisee(w2);
        m2.addSupervisee(w3);
        m3.addSupervisee(m1);
        m3.addSupervisee(m2);
        
        System.out.println("Monthly payment to " + m3.getFullName() + " and his/her employees:");
        m3.printMonthlyPayment();
        System.out.println();
        
        m1.removeSupervisee(w2);
        
        System.out.println("Monthly payment to " + m1.getFullName() + " and his/her employees:");
        m1.printMonthlyPayment();
        System.out.println();
                
        System.out.println("Monthly payment to " + m2.getFullName() + " and his/her employees:");
        m2.printMonthlyPayment();
    }
}
/*
If your three java classes are implemented correctly, you should see the following results displayed:

Monthly payment to Paul Won and his/her employees:
Paul Won: 6000.0
Pam Hulo: 3000.0
John Smith: 4800.0
Sam Goah: 4000.0
Lucy Buffett: 3750.0
Doug Frank: 2000.0

Monthly payment to Pam Hulo and his/her employees:
Pam Hulo: 3000.0
John Smith: 4800.0

Monthly payment to Lucy Buffett and his/her employees:
Lucy Buffett: 3750.0
Doug Frank: 2000.0

*/