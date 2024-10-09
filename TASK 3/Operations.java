public class Operations {

    public static void main(String[] args) {
        String String = "Hey I am Jyothi";

        // to find the length 
        int length = String.length();
        System.out.println("Length of the string: " + length);

        // to uppercase
        String upperCase = String.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);

        // extract a substring 
        String substring = String.substring(9);
        System.out.println("Substring : " + substring);

        // replace a character 
        String replacedString = String.replace('i', 'y');
        System.out.println("String after replacing : " + replacedString);
    }
}

