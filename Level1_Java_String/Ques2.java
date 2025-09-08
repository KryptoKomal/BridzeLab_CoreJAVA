import java.util.Scanner;

public class SubstringCompare {
    static String createSubstring(String text, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub += text.charAt(i);
        }
        return sub;
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
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String sub1 = createSubstring(text, start, end);
        String sub2 = text.substring(start, end);
        System.out.println("User defined substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Both same? " + compareStrings(sub1, sub2));
        sc.close();
    }
}
