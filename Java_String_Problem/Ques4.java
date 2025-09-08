import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter string to remove duplicates: ");
        String s4 = sc.nextLine();
        String nd = "";
        for(int i=0;i<s4.length();i++){
            if(nd.indexOf(s4.charAt(i))==-1) nd+=s4.charAt(i);
