import java.util.*;

class VowelConsonantType {
    public static String type(char c) {
        c = Character.toLowerCase(c);
        if(c>='a'&&c<='z') {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static String[][] classify(String s) {
        String[][] res=new String[s.length()][2];
        for(int i=0;i<s.length();i++) {
            res[i][0]=String.valueOf(s.charAt(i));
            res[i][1]=type(s.charAt(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[][] arr=classify(s);
        for(String[] row:arr) System.out.println(row[0]+"\t"+row[1]);
    }
}
