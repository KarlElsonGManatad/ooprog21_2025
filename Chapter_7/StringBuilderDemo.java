import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        
        System.out.print("Enter a name: ");
        String name = kb.nextLine();

        
        System.out.print("Enter an address: ");
        String address = kb.nextLine();

  
        StringBuilder nameString = new StringBuilder(name);
        StringBuilder addressString = new StringBuilder(address);

        
        System.out.println("\n(StringBuilder 1) nameString: " + nameString);
        System.out.println("Capacity of nameString is: " + nameString.capacity());

        System.out.println("(StringBuilder 2) addressString: " + addressString);
        System.out.println("Capacity of addressString is: " + addressString.capacity());
        nameString.setLength(20);
        addressString.setLength(20);

    
        System.out.println("(Length set to 20 for StringBuilder 1) The name is " + nameString);
        System.out.println("(Length set to 20 for StringBuilder 2) The address is " + addressString);

        kb.close();
    }
}