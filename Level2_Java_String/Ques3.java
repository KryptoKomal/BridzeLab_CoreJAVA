import java.util.*;

class WordsWithLength {
    public static int length(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static String[] splitWords(String s) {
        int len = length(s), count = 1;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') count++;
        String[] words = new String[count];
        int start = 0, idx = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || s.charAt(i) == ' ') {
                words[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static String[][] wordWithLength(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(length(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] data = wordWithLength(splitWords(s));
        for (String[] row : data) System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
