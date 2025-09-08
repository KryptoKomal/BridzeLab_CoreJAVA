import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   System.out.print("Enter sentence: ");
        String s12 = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String w1 = sc.nextLine();
        System.out.print("Enter replacement word: ");
        String w2 = sc.nextLine();
        String replaced = s12.replaceAll("\\b"+w1+"\\b", w2);
        System.out.println("Modified Sentence: "+replaced);
    }
}
