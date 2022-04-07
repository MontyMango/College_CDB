public abstract class Employee {
    private final int ID;
    private final String first_name;
    private final String last_name;

    public Employee(int Input_ID, String Input_FName, String Input_LName) {
        this.ID = Input_ID;
        this.first_name = Input_FName;
        this.last_name = Input_LName;
    }

    public String getFullName()    {
        return (this.first_name + " " + this.last_name);
    }

    public abstract void printMonthlyPayment();
}
