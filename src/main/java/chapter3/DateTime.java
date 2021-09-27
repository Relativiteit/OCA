import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 * @author Alejo Cain
 * @date 18-09-2021
 */

public class DateTime {
    public static void main(String[] args) {
        // Current Date
        LocalDate currentDate = LocalDate.now(); // LocalDate object
        System.out.println(currentDate);

        // current Time
        LocalTime currentTime = LocalTime.now(); // localTime Object
        System.out.println(currentTime);

        // Current Date and Time
        LocalDateTime currentDateTime = LocalDateTime.now(); // LocalDateTime object
        System.out.println(currentDateTime);

        // Formatting Dat and Time
        LocalDateTime currentDateTime2 = LocalDateTime.now();
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Before formatting: " + currentDateTime2);

        String formattedCurrentDateTime2 = currentDateTime2.format(formatDateTime);
        System.out.println("After Formatting: " + formattedCurrentDateTime2);

    }
    }