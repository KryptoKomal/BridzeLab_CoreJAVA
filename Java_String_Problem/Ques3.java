import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter string to check palindrome: ");
        String s3 = sc.nextLine();
        String r3 = "";
        for(int i=s3.length()-1;i>=0;i--) r3 += s3.charAt(i);
        System.out.println(s3.equals(r3)?"Palindrome":"Not Palindrome");
