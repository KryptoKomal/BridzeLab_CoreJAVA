import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter string to toggle case: ");
        String s7 = sc.nextLine();
        String toggle="";
        for(int i=0;i<s7.length();i++){
            char c = s7.charAt(i);
            if(Character.isUpperCase(c)) toggle += Character.toLowerCase(c);
            else toggle += Character.toUpperCase(c);
        }
        System.out.println("Toggled: "+toggle);
