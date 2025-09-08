import java.util.Scanner;

public class PalindromeChecker {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = getInput("Enter a string: ");
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    static String getInput(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
