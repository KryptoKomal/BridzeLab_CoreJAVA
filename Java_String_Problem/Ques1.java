import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        int vowels = 0, consonants = 0;
        for(int i = 0; i < s1.length(); i++){
            char ch = Character.toLowerCase(s1.charAt(i));
            if(ch >= 'a' && ch <= 'z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: "+vowels+" Consonants: "+consonants);
