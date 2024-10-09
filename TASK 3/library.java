import java.util.ArrayList;
import java.util.Scanner;
public class library {
                                                                      
    public static void main(String[] args) {
        ArrayList<String[]> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add a new book");
            System.out.println("2. Remove a book");
            System.out.println("3. Display all books");
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
                    String price = scanner.nextLine();
                    scanner.nextLine(); 
                    
                    library.add(new String[]{title, author, isbn, price});
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    // Remove a book
                    System.out.print("Enter book ISBN to remove: ");
                    String removeIsbn = scanner.nextLine();
                    boolean removed = false;
                    
                    for (int i = 0; i < library.size(); i++) {
                        String[] book = library.get(i);
                        if (book[2].equals(removeIsbn)) {
                            library.remove(i);
                            removed = true;
                            System.out.println("Book removed successfully.");
                            break; 
                        }
                    }
                    if (!removed) {
                        System.out.println("No book found with the given ISBN.");
                    }
                    break;

                case 3:
                    // Display all books
                    System.out.println("Books in the library:");
                    if (library.isEmpty()) {
                        System.out.println("No books in the library.");
                    } else {
                        for (String[] book : library) {
                            System.out.println("Title: " + book[0] + ", Author: " + book[1] + ", ISBN: " + book[2] + ", Price: Rs" + book[3]);
                        }
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


