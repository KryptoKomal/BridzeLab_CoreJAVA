import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.print("Enter string: ");
        String s9 = sc.nextLine();
        int[] freq = new int[256];
        for(int i=0;i<s9.length();i++) freq[s9.charAt(i)]++;
        int max=0; char mf=' ';
        for(int i=0;i<256;i++){
            if(freq[i]>max){ max=freq[i]; mf=(char)i; }
        }
        System.out.println("Most Frequent Character: '"+mf+"'");
