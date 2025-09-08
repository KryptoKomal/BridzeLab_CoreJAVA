import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.print("Enter string: ");
        String s6 = sc.nextLine();
        System.out.print("Enter substring to count: ");
        String sub = sc.nextLine();
        int count=0, idx=0;
        while((idx=s6.indexOf(sub, idx))!=-1){
            count++;
            idx += sub.length();
        }
        System.out.println("Occurrences: "+count);
