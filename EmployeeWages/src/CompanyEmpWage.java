import java.util.ArrayList;
import java.util.Scanner;

//UC 10

public class CompanyEmpWage {
    static Scanner scanner = new Scanner(System.in);

    public String companyName;
    // public Employee employee;
    public int wagePerHour;
    public int workingDaysPerMonth;
    public int workingHoursPerMonth;

    // UC 9
    public int totalEmpWage;
    public ArrayList<Integer> dailyWageList;

    public CompanyEmpWage() {
        this(getStringInp(),
                getIntInp("Enter the wage per hour: "),
                getIntInp("Enter the working days per month: "),
                getIntInp("Enter the working hours per month: "));
    }

    public CompanyEmpWage(String name, int wage, int workingDays, int workingHours) {
        // this.employee = new Employee();
        this.companyName = name;
        this.wagePerHour = wage;
        this.workingDaysPerMonth = workingDays;
        this.workingHoursPerMonth = workingHours;
        this.totalEmpWage = 0;
        this.dailyWageList = new ArrayList<>();
    }

    public static String getStringInp() {
        System.out.println("Enter the company name: ");
        return scanner.next();
    }

    public static int getIntInp(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public void displayCompanyDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Wage Per Hour: " + wagePerHour);
        System.out.println("Working Days Per Month: " + workingDaysPerMonth);
        System.out.println("Working Hours Per Month: " + workingHoursPerMonth);
        System.out.println("Total Employee Wage: " + totalEmpWage);
        System.out.println("Daily Wage List: " + dailyWageList.toString());
    }

}