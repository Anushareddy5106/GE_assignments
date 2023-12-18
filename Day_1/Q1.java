import java.util.Random;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();

        if (numFlips <= 0) {
            System.out.println("Please enter a positive integer for the number of flips.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;
        Random random = new Random();

        for (int i = 0; i < numFlips; i++) {
            float result = random.nextFloat();
            if (result < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        double headsPercentage = (headsCount * 100.0) / numFlips;
        double tailsPercentage = (tailsCount * 100.0) / numFlips;

        System.out.printf("Heads: %.2f%%\n", headsPercentage);
        System.out.printf("Tails: %.2f%%\n", tailsPercentage);
    }
}
