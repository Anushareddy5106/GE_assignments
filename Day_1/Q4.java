import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("N should be a non-zero positive integer.");
            scanner.close();

            return;
        }

        double harmonicNumber = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonicNumber += 1.0 / i;
        }

        System.out.println("The " + n + "th Harmonic Value is: " + harmonicNumber);
    }
}
