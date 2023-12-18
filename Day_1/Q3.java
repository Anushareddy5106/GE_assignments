import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 31: ");
        int n = scanner.nextInt();

        int curr = 1;

        int it = 0;
        while (it <= n) {
            System.out.println("2 raised to the power " + it + ": " + curr);
            curr = curr * 2;

            it++;
        }
    }
}