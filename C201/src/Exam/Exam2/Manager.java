import java.util.ArrayList;

public class Manager extends Employee   {

    private final double yearly_salary;
    private ArrayList<Employee> supervisees = new ArrayList<Employee>();

    public Manager(int ID, String FName, String LName, double YSalary)  {
        super(ID, FName, LName);
        this.yearly_salary = YSalary;
    }

    public void addSupervisee(Employee e)    {
        this.supervisees.add(e);
    }

    public void removeSupervisee(Employee e)    {
        this.supervisees.remove(e);
    }

    public void printMonthlyPayment()   {
        System.out.printf("%s: %.1f %n", this.getFullName(), (this.yearly_salary / 12));

        for (Employee supervisee : this.supervisees) {
            supervisee.printMonthlyPayment();
        }
    }
}
