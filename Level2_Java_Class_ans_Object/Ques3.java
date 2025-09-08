class PalindromeChecker {
    String text;


    PalindromeChecker(String text) {
        this.text = text;
    }

   
    boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = cleanText.length() - 1;
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

   
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeProgram {
    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker("Madam");
        pc.displayResult();
    }
}
