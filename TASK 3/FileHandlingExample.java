import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandlingExample {

    
    public static List<String> readFromFile(String fileName) {
        List<String> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                records.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return records;
    }

    
    public static void writeToFile(String fileName, List<String> records) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (String record : records) {
                bw.write(record);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputFile = "employees.txt";
        String outputFile = "updated_employees.txt";

        
        List<String> records = readFromFile(inputFile);

        
        System.out.println("Records read from " + inputFile + ":");
        for (String record : records) {
            System.out.println(record);
        }

        
        records.add("Emily Johnson,UX Designer,55000");

       
        writeToFile(outputFile, records);

        System.out.println("Updated records have been written to " + outputFile);
    }
}
                                                         