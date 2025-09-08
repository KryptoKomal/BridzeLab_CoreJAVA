import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  System.out.print("Enter string to reverse: ");
        String s2 = sc.nextLine();
        String rev = "";
        for(int i=s2.length()-1;i>=0;i--) rev += s2.charAt(i);
        System.out.println("Reversed: "+rev);
