import java.util.HashMap;
import java.util.Scanner;
public class librarylookup {
    public static void main(String[] args) {
        
        HashMap<String, String[]> books = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Book Menu:");
            System.out.println("1. Add a new book");
            System.out.println("2. Update a book");
            System.out.println("3. Retrieve a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add a new book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter book price: Rs");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); 

                    
                    books.put(isbn, new String[]{title, author, Double.toString(price)});
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    // Update a book
                    System.out.print("Enter book ISBN to update: ");
                    String updateIsbn = scanner.nextLine();
                    if (books.containsKey(updateIsbn)) {
                        System.out.print("Enter new book title: ");
                        String nTitle = scanner.nextLine();
                        System.out.print("Enter new book author: ");
                        String nAuthor = scanner.nextLine();
                        System.out.print("Enter new book price: Rs");
                        double nPrice = scanner.nextDouble();
                        scanner.nextLine(); 

                        
                        books.put(updateIsbn, new String[]{nTitle, nAuthor, Double.toString(nPrice)});
                        System.out.println("Book updated successfully.");
                    } else {
                        System.out.println("No book found with the given ISBN.");
                    }
                    break;

                case 3:
                    // Retrieve a book
                    System.out.print("Enter book ISBN to retrieve: ");
                    String retrieveIsbn = scanner.nextLine();
                    if (books.containsKey(retrieveIsbn)) {
                        String[] bookDetails = books.get(retrieveIsbn);
                        System.out.println("Title: " + bookDetails[0]);
                        System.out.println("Author: " + bookDetails[1]);
                        System.out.println("Price: Rs" + bookDetails[2]);
                    } else {
                        System.out.println("No book found with the given ISBN.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}


