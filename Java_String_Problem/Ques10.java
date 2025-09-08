import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter string: ");
        String s10 = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char rem = sc.next().charAt(0); sc.nextLine();
        String res="";
        for(int i=0;i<s10.length();i++){
            if(s10.charAt(i)!=rem) res+=s10.charAt(i);
        }
        System.out.println("Modified String: "+res);
