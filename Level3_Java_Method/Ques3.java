public class NumberChecker2 {
    public static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static int sumDigits(int[] d) {
        int sum = 0;
        for (int x : d) sum += x;
        return sum;
    }

    public static int sumSquares(int[] d) {
        int sum = 0;
        for (int x : d) sum += Math.pow(x, 2);
        return sum;
    }

    public static boolean isHarshad(int n) {
        int[] d = storeDigits(n);
        return n % sumDigits(d) == 0;
    }

    public static int[][] frequency(int n) {
        int[] d = storeDigits(n);
        int[] freq = new int[10];
        for (int x : d) freq[x]++;
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 21;
        System.out.println("Harshad: " + isHarshad(n));
    }
}
