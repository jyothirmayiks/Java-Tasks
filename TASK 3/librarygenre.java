import java.util.HashSet;
import java.util.Scanner;

public class librarygenre {
    public static void main(String[] args) {
       
        HashSet<String> genres = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Genre Menu:");
            System.out.println("1. Add a new genre");
            System.out.println("2. Display all genres");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Add a new genre
                    System.out.print("Enter genre to add: ");
                    String genre = scanner.nextLine();
                    boolean added = genres.add(genre);
                    if (added) {
                        System.out.println("Genre added successfully.");
                    } else {
                        System.out.println("Genre already exists.");
                    }
                    break;

                case 2:
                    // Display all genres
                    System.out.println("Genres in the library:");
                    if (genres.isEmpty()) {
                        System.out.println("No genres available.");
                    } else {
                        for (String g : genres) {
                            System.out.println(g);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();  
    }
    
}


