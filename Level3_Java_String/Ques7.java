import java.util.*;

class PalindromeCheck {
    public static boolean isPalindrome1(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindrome2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindrome2(text, start + 1, end - 1);
    }

    public static String reverse(String text) {
        char[] rev = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            rev[i] = text.charAt(text.length() - 1 - i);
        }
        return new String(rev);
    }

    public static boolean isPalindrome3(String text) {
        String rev = reverse(text);
        return text.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Palindrome (Logic 1): " + isPalindrome1(text));
        System.out.println("Palindrome (Logic 2): " + isPalindrome2(text, 0, text.length() - 1));
        System.out.println("Palindrome (Logic 3): " + isPalindrome3(text));
    }
}
