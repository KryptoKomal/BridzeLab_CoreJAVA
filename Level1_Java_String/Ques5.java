import java.util.Scanner;

public class StringIndexDemo {
    static void generateException(String s) {
        System.out.println(s.charAt(s.length()));
    }

    static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       
        handleException(s);
        sc.close();
    }
}
