import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static Line getLine() {
        System.out.print("Enter start point of line: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter end point of line: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        Line line = new Line(x1, y1, x2, y2);

        return line;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to line comparision computation");

        System.out.println("For line 1:");
        Line line1 = getLine();

        System.out.println("Length of line 1: " + line1.length);

        Line line2 = getLine();

        System.out.println("Length of line 2: " + line2.length);

        scanner.close();

        boolean lineEqual = line1.equals(line2);

        if (lineEqual) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }

        int lineCompare = line1.compareTo(line2);

        String temp = lineCompare == 0 ? "Both lines are of equal length"
                : lineCompare > 0 ? "Line 1 is greater than line 2" : "Line 1 is smaller than line 2";

        System.out.println(temp);

    }
}