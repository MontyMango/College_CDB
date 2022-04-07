public class Worker extends Employee {

    private final double weekly_salary;

    public Worker(int ID, String FName, String LName, double WSalary)   {
        super(ID, FName, LName);
        this.weekly_salary = WSalary;

    }

    @Override
    public void printMonthlyPayment()   {
        System.out.printf("%s: %.1f %n" , getFullName(), (4 * this.weekly_salary));
    }
}
