public class Parse {

 
        public static void main(String[] args) {
            //input strings
            String intStr = "500";
            String doubleStr = "500.55";
            String booleanStr = "true";
            
    
            // Parsing strings to primitive data types
            int pInt = Integer.parseInt(intStr);
            double pDouble = Double.parseDouble(doubleStr);
            boolean pBoolean = Boolean.parseBoolean(booleanStr);

            System.out.println("Parsed values:");
            System.out.println("Integer: " + pInt);
            System.out.println("Double: " + pDouble);
            System.out.println("Boolean: " + pBoolean);
            
    
            // Converting primitive data types to strings
            String intToStr = String.valueOf(pInt);
            String doubleToStr = String.valueOf(pDouble);
            String booleanToStr = String.valueOf(pBoolean);
        
            System.out.println("\nConverted back to strings:");
            System.out.println("Integer to String: " + intToStr);
            System.out.println("Double to String: " + doubleToStr);
            System.out.println("Boolean to String: " + booleanToStr);
            
    }
    
}        
    
                                                    
    
