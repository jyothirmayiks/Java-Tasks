
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

public class ProductInventory {

   
    private static List<String> products = new ArrayList<>();

  
    static {
        products.add("Dress");
        products.add("Wallet");
        products.add("Mobile");
    }

    
    public static void findProduct(String productName) throws ProductNotFoundException {
        if (!products.contains(productName)) {
            throw new ProductNotFoundException(productName + " not found in the inventory.");
        }
        System.out.println(productName + " is available in the inventory.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter product name to search: ");
            String productName = scanner.nextLine();

            
            findProduct(productName);
        } catch (ProductNotFoundException e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            
            System.out.println("Search operation completed.");
            scanner.close(); 
        }
    }
}

