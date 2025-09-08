import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
 System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);
        LocalDate modified = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Modified Date: " + modified);
