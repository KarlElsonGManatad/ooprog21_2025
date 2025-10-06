import java.util.Scanner;

    public class Payroll
    {
        public static void main(String[] args)
        {

            Scanner input = new Scanner(System.in);

            System.out.print("How many hours did you work this week? ");
            double hoursWorked = input.nextDouble();

            System.out.print("What is your Regular pay Rate? ");
            double payRate = input.nextDouble();

            Employee emplo = new Employee(1001, payRate);

            double regPay = emplo.getRegularPay(hoursWorked);
            double otPay = emplo.getOvertimePay(hoursWorked);

            System.out.println("Regular pay is " + regPay);
            System.out.println("Overtime pay is " + otPay);
        input.close();
        }
        
    }