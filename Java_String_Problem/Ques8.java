import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.print("Enter first string: ");
        String s8a = sc.nextLine();
        System.out.print("Enter second string: ");
        String s8b = sc.nextLine();
        int n = Math.min(s8a.length(), s8b.length()), cmp=0;
        for(int i=0;i<n;i++){
            if(s8a.charAt(i)!=s8b.charAt(i)){
                cmp = s8a.charAt(i)-s8b.charAt(i);
                break;
            }
        }
        if(cmp==0) cmp = s8a.length()-s8b.length();
        System.out.println(cmp<0?s8a+" comes before "+s8b:s8b+" comes before "+s8a);
