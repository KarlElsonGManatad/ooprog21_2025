public class Employee{

    private int employeeNumber;
    private double payRate;
    private static final int maxEmployee = 9999;
    private static final double maxRate = 60.00;
    private static final double overTime = 1.5;

    public Employee(int employeeNumber, double payRate)
        {
         if (employeeNumber > maxEmployee)
             employeeNumber = maxEmployee;
         if (payRate > maxRate)
             payRate = maxRate;
         this.employeeNumber = employeeNumber;
         this.payRate = payRate;
        }

    public double getRegularPay(double hoursWorked)
        {
         if (hoursWorked <= 40)
             return hoursWorked * payRate;
         else
             return 40 * payRate;
        }

    public double getOvertimePay(double hoursWorked)
        {
         if (hoursWorked > 40)
                return (hoursWorked - 40) * (payRate * overTime);
         else
                return 0; 
        }

    public int getemployeeNumber()
        {
            return employeeNumber;
        }
    
    public double getpayRate()
        {
            return payRate;
        }
    
}