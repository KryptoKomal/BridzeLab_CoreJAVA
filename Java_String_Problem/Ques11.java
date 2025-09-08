import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String s11a = sc.nextLine().replaceAll("\\s","").toLowerCase();
        System.out.print("Enter second string: ");
        String s11b = sc.nextLine().replaceAll("\\s","").toLowerCase();
        if(s11a.length()!=s11b.length()) System.out.println("Not Anagram");
        else{
            char[] c1 = s11a.toCharArray();
            char[] c2 = s11b.toCharArray();
            Arrays.sort(c1); Arrays.sort(c2);
            System.out.println(Arrays.equals(c1,c2)?"Anagram":"Not Anagram");
        }
