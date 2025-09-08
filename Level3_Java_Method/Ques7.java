public class FactorsProgram {
    public static int[] factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] f = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[idx++] = i;
        return f;
    }

    public static int greatestFactor(int[] f) {
        return f[f.length - 1];
    }

    public static int sumFactors(int[] f) {
        int sum = 0;
        for (int x : f) sum += x;
        return sum;
    }

    public static int productFactors(int[] f) {
        int prod = 1;
        for (int x : f) prod *= x;
        return prod;
    }

    public static double productCubes(int[] f) {
        double prod = 1;
        for (int x : f) prod *= Math.pow(x, 3);
        return prod;
    }

    public static void main(String[] args) {
        int n = 12;
        int[] f = factors(n);
        System.out.println("Greatest factor: " + greatestFactor(f));
        System.out.println("Sum: " + sumFactors(f));
        System.out.println("Product: " + productFactors(f));
        System.out.println("Product of cubes: " + productCubes(f));
    }
}
