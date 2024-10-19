public class Main {
    public static void main(String[] args) {
        ContractedEmployee emp1 = new ContractedEmployee ( "ID456", "Volodymyr", "TAX123");
        emp1.setHourlyRate ( 5.00 );
        emp1.setNumberOfHoursWorked ( 20.00 );
        System.out.println (emp1.calculatePay ());

        SalariedEmployee emp2 = new SalariedEmployee ( "ID123", "Petro", "SSN123" );
        emp2.setFixedMonthlyPayment ( 2500 );
        System.out.println (emp2.calculatePay ());

        System.out.println (emp1.getName());
        System.out.println (emp2.getName());

        System.out.println (emp1.getEmployeeId ());
        System.out.println (emp2.getEmployeeId ());




    }
}
