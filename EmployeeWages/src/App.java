import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to employee wage builder");

        // UC7;
        ArrayList<Company> companyList = new ArrayList<>();

        int option;

        do {
            System.out.println("--------------------------");
            System.out.println("Enter 1 to display companyList");
            System.out.println("Enter 2 Add company");
            System.out.println("Enter 0 to end");
            System.out.println("--------------------------");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (companyList.size() == 0)
                        System.out.println("CompanyList is empty");
                    for (int i = 0; i < companyList.size(); i++) {
                        System.out.println("---- company " + (i + 1) + " : -----");
                        companyList.get(i).displayCompanyDetails();
                    }
                    break;
                case 2:
                    Company company = new Company();
                    companyList.add(company);
                    break;
                default:
                    System.out.println("Enter a valid number");
                    break;
            }
        } while (option != 0);

    }

}
