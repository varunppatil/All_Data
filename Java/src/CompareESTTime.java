import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.format.DateTimeParseException;

public class CompareESTTime {
    public static void main(String[] args) {
        // Define the EST zone id. EST is UTC-5:00, and it adjusts for daylight saving.
        ZoneId estZoneId = ZoneId.of("America/New_York");
        
        // Get the current date and time in the EST time zone
        ZonedDateTime currentTime = ZonedDateTime.now(estZoneId);
        
        // Specify the time to compare in string format
        String timeToCompareStr = "Jun 15, 2024 | 04:29 PM"; // Example time string
        
        // Define the formatter with the same pattern as the input string
      //  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mmm dd, yyyy | hh:mm a");
        
        // Parse the time to compare from the string into a LocalDateTime
        
        
       // final static DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a z");
      //req  ZonedDateTime zdtWithZoneOffset = ZonedDateTime.parse(timeToCompareStr, formatter);
       
        
        //ZonedDateTime zdtInLocalTimeline = zdtWithZoneOffset.withZoneSameInstant(ZoneId.systemDefault());
       // System.out.println(zdtWithZoneOffset);
       // System.out.println(zdtInLocalTimeline);
        String newTime ="2019-03-27 10:15:30 am -05:00";
        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a z");
        ZonedDateTime zdtWithZoneOffset = ZonedDateTime.parse(newTime, formatter);
        ZonedDateTime zdtInLocalTimeline = zdtWithZoneOffset.withZoneSameInstant(ZoneId.systemDefault());
        System.out.println(zdtWithZoneOffset);
        System.out.println(zdtInLocalTimeline);
        
        
        
        
        
        // Convert the parsed LocalDateTime to ZonedDateTime in EST
       // ZonedDateTime timeToCompare = zdtWithZoneOffset.atZone(estZoneId);
        
        // Print the current EST time
        System.out.println("Current EST time: " + currentTime.format(formatter));
        
        // Print the time to compare
        System.out.println("Time to compare: " + zdtWithZoneOffset.format(formatter));
        
        // Calculate the duration between the current time and the time to compare
        Duration duration = Duration.between(zdtWithZoneOffset, currentTime);
        
        // Check if the current time is equal to or greater than 1 minute ahead of the specified time
        if (duration.toMinutes() >= 1) {
            System.out.println("The current time is equal to or greater than 1 minute ahead of the specified time.");
        } else {
            System.out.println("The current time is less than 1 minute ahead of the specified time.");
        }
    }
}
