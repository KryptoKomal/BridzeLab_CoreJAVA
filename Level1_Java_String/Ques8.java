import java.util.Scanner;

public class ArrayIndexDemo {
    static void generateException(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        for (int i = 0; i < 3; i++) arr[i] = sc.next();
     
        handleException(arr);
        sc.close();
    }
}
