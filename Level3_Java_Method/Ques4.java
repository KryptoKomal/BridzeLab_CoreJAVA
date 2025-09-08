import java.util.Arrays;

public class NumberChecker3 {
    public static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static int[] reverseDigits(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++) r[i] = d[d.length - 1 - i];
        return r;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int n) {
        int[] d = storeDigits(n);
        return arraysEqual(d, reverseDigits(d));
    }

    public static boolean isDuck(int n) {
        return String.valueOf(n).contains("0");
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println("Palindrome: " + isPalindrome(n));
        System.out.println("Duck: " + isDuck(n));
    }
}
