import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeConverter {
    
    public static void main(String[] args) {
        
        // Accept date and time from user input
        String input = "31/12/2022 23:59:59";
        
        // Convert date and time formats
        String output1 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")).format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss a"));
        String output2 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")).format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        String output3 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a")).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String output4 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a")).format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        String output5 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm")).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String output6 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm")).format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss a"));
        
        // Print results
        System.out.println("Input: " + input);
        System.out.println("Output 1: " + output1);
        System.out.println("Output 2: " + output2);
        System.out.println("Output 3: " + output3);
        System.out.println("Output 4: " + output4);
        System.out.println("Output 5: " + output5);
        System.out.println("Output 6: " + output6);
    }
}