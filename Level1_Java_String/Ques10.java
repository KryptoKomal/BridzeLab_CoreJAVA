import java.util.Scanner;

public class ToLowerDemo {
    static String toLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char)(c + 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String userLower = toLower(text);
        String builtLower = text.toLowerCase();
        System.out.println("User Lower: " + userLower);
        System.out.println("Built-in Lower: " + builtLower);
        System.out.println("Both same? " + compareStrings(userLower, builtLower));
        sc.close();
    }
}
