public class NumberChecker1 {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static boolean isDuck(int n) {
        return String.valueOf(n).contains("0");
    }

    public static boolean isArmstrong(int n) {
        int[] d = storeDigits(n);
        int p = d.length, sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        return sum == n;
    }

    public static int[] largestTwo(int[] d) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first) second = x;
        }
        return new int[]{first, second};
    }

    public static int[] smallestTwo(int[] d) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < first) {
                second = first;
                first = x;
            } else if (x < second && x != first) second = x;
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int n = 153;
        int[] d = storeDigits(n);
        System.out.println("Duck: " + isDuck(n));
        System.out.println("Armstrong: " + isArmstrong(n));
        int[] l = largestTwo(d);
        int[] s = smallestTwo(d);
        System.out.println("Largest two: " + l[0] + ", " + l[1]);
        System.out.println("Smallest two: " + s[0] + ", " + s[1]);
    }
}
