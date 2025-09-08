import java.util.*;

class ShortLong {
    public static int length(String s) {
        int count = 0;
        try {
            while (true) { s.charAt(count); count++; }
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = splitWords(s);
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (length(w) < length(shortest)) shortest = w;
            if (length(w) > length(longest)) longest = w;
        }
        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
    }
}
