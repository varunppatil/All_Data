import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ab {

	public static void main(String[] args) {
		
		// tuza zone
        ZoneId estZoneId = ZoneId.of("America/New_York");
        
        // tya zone cha time
        ZonedDateTime currentTime = ZonedDateTime.now(estZoneId);
        System.out.println(currentTime);
        //tuzi xpath chi string
        String timeToCompareStr = "Jun 15, 2024 | 04:29 PM"; 
        
        // tuza date formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy '|' hh:mm a", java.util.Locale.ENGLISH).withZone(estZoneId);
        
        //tuzi xpath chya string la local time madhe convert kela
        LocalDateTime datetime = LocalDateTime.parse(timeToCompareStr, formatter);
        //then zone time madhe //nasel samajala tar zoned and currentTime print karun bhag :)
        ZonedDateTime zoned = datetime.atZone(estZoneId);
        
        //fark between both dates
        Duration duration = Duration.between(zoned, currentTime);
        long hours = duration.toHours(); 
        long minutes = duration.toMinutes() % 60; 
        
        System.out.println("Difference: " + hours + " hours and " + minutes + " minutes");
	}
}