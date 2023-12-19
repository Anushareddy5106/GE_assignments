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

        System.out.println("For line :");
        Line line = getLine();

        System.out.println("Length of line : " + line.length);

      
    }
}