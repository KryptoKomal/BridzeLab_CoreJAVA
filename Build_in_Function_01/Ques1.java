import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("GMT: " + gmt.toLocalTime());
        System.out.println("IST: " + ist.toLocalTime());
        System.out.println("PST: " + pst.toLocalTime());
