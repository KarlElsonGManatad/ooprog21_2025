package Chapter_6;
import java.util.Scanner;

public class CodingBankBalance2 {
    public static void main(String[] args)
    {
        double bal;
        double Inrate = 0.03;
        int year = 0;
        int choice;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        bal = input.nextDouble();
     
        do 
        {
            year = year + 1;
            bal = bal + (bal * Inrate);
            
            System.out.printf("After year %d at %.2f interest rate, balance is %.2f%n", year, Inrate, bal);

            System.out.print("Do you want to see the balance at the end of another year? Enter 1 for yes or any number for no >> ");
            choice = input.nextInt();

            
        }while (choice == 1);

        input.close();
    }
    
}

