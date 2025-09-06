import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter height of Amar: ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightAnthony = sc.nextInt();

   
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is youngest");
        } else if (ageAkbar < ageAnthony) {
            System.out.println("Akbar is youngest");
        } else {
            System.out.println("Anthony is youngest");
        }

        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is tallest");
        } else if (heightAkbar > heightAnthony) {
            System.out.println("Akbar is tallest");
        } else {
            System.out.println("Anthony is tallest");
        }
    }
}
