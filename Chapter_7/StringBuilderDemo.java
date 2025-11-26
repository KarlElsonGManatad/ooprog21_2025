import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Ask user for name
        System.out.print("Enter a name: ");
        String name = kb.nextLine();

        // Ask user for address
        System.out.print("Enter an address: ");
        String address = kb.nextLine();

        // Create StringBuilder objects
        StringBuilder nameString = new StringBuilder(name);
        StringBuilder addressString = new StringBuilder(address);

        // Display original string values and capacity
        System.out.println("\n(StringBuilder 1) nameString: " + nameString);
        System.out.println("Capacity of nameString is: " + nameString.capacity());

        System.out.println("(StringBuilder 2) addressString: " + addressString);
        System.out.println("Capacity of addressString is: " + addressString.capacity());

        // Change their lengths using setLength()
        nameString.setLength(20);
        addressString.setLength(20);

        // Display after changing length
        System.out.println("(Length set to 20 for StringBuilder 1) The name is " + nameString);
        System.out.println("(Length set to 20 for StringBuilder 2) The address is " + addressString);

        kb.close();
    }
}