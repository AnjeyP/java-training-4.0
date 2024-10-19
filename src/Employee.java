public class Employee implements Payable{
    // TODO fix class declaration and declare variables here
    protected String employeeId;
    protected String name;

    public Employee() {
        // TODO fill in code here
        //this.employeeId = employeeId;
        //this.name = name;
    }

    public String getEmployeeId() {
        // TODO fill in code here and replace the return statement
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        // TODO fill in code here
        this.employeeId = employeeId;
    }

    public String getName() {
        // TODO fill in code here and replace the return statement
        return this.name;
    }

    public void setName(String name) {
        // TODO fill in code here
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement
        return this.calculatePay();
    }

    @Override
    public String toString() {
        // TODO fill in code here and replace the return statement, be sure to format double value
        return this.getName () + "'s average monthly salary is " + String.format("%.2f", this.getAverageMonthlySalary ());
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}