package Chapter_6;
import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double initialBalance = input.nextDouble();

        for (double rate = 0.02; rate <= 0.05; rate += 0.01)
        {
            double bal = initialBalance;

            System.out.println("\nWith an initial balance of $" + initialBalance + " at an interest rate of " + rate);

            for (int year = 1; year <= 4; year++) 
            {
                bal += bal * rate;
                System.out.printf("After year %d balance is %.4f%n", year, bal);
            }
        }
        input.close();
    }
}
