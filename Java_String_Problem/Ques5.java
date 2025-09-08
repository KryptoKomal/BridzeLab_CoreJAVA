import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter a sentence: ");
        String s5 = sc.nextLine();
        String[] words = s5.split(" ");
        String longest = "";
        for(String w: words){
            if(w.length()>longest.length()) longest=w;
