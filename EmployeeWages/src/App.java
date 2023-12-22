import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to employee wage builder");

        // UC7;
        // ArrayList<CompanyEmpWage> companyList = new ArrayList<>();

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();

        int option;

        do {
            System.out.println("--------------------------");
            System.out.println("Enter 1 to display companyList");
            System.out.println("Enter 2 Add company");
            System.out.println("Enter 3 to get Total Wage of Company");
            System.out.println("Enter 0 to end");
            System.out.println("--------------------------");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    empWageBuilder.display();
                    break;
                case 2:
                    empWageBuilder.addCompanyEmpWage();
                    break;
                case 3:
                    System.out.println("Enter the Company Name: ");
                    String company = scanner.next();
                    System.out.println("Total Employee Wage: " + empWageBuilder.getTotalWage(company));
                    break;
                default:
                    System.out.println("Enter a valid number");
                    break;
            }
        } while (option != 0);

    }

}
