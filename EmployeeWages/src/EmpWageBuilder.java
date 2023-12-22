import java.util.ArrayList;
import java.util.Scanner;

//UC 11

interface ComputeEmpWageInterface {
    void addCompanyEmpWage();

    void computeEmpWage();

    int getTotalWage(String company);
}

class EmpWageBuilder implements ComputeEmpWageInterface {
    private static Scanner scanner = new Scanner(System.in);

    private static final int FULLTIME_HRS = 8;
    private static final int PARTTIME_HRS = 4;

    ArrayList<CompanyEmpWage> companyEmpWageList;

    public EmpWageBuilder() {
        this.companyEmpWageList = new ArrayList<>();
    }

    // UC 12
    @Override
    public void addCompanyEmpWage() {
        CompanyEmpWage company = new CompanyEmpWage();
        companyEmpWageList.add(company);
        computeEmpWage();

    }

    @Override
    public void computeEmpWage() {
        int numOfCompanies = companyEmpWageList.size();
        for (int i = 0; i < numOfCompanies; i++) {

            // UC 9
            CompanyEmpWage company = companyEmpWageList.get(i);
            company.totalEmpWage = monthlyWage(company);
            System.out.println("Total Wage for " + companyEmpWageList.get(i).companyName + ": "
                    + companyEmpWageList.get(i).totalEmpWage);
        }
    }

    // UC 14

    @Override
    public int getTotalWage(String company) {
        int numOfCompanies = companyEmpWageList.size();
        for (int i = 0; i < numOfCompanies; i++) {
            if (companyEmpWageList.get(i).companyName.equals(company)) {
                return companyEmpWageList.get(i).totalEmpWage;
            }
        }

        return 0; // Return 0 if the company is not found
    }

    // UC1 && UC4
    public static int isPresent() {
        int empCheck = Math.random() < 0.5 ? 0 : 1;
        return empCheck;
    }

    private int isFullTime() {
        int isFullTime = Math.random() > 0.5 ? 1 : 0;
        return isFullTime;
    }

    private int EmpWorkingHrs() {

        if (isPresent() == 0)
            return 0;

        int isFullTime = isFullTime();
        int workingHours = 0;

        if (isFullTime == 1)
            workingHours = FULLTIME_HRS;
        else
            workingHours = PARTTIME_HRS;

        return workingHours;
    }

    // UC2 && UC3 daily wage calculation
    public int dailyWage(int wagePerHour) {
        int workingHours = EmpWorkingHrs();

        int wage = workingHours * wagePerHour;
        return wage;
    }

    // UC5 && UC6 monthly wage calculation
    public int monthlyWage(CompanyEmpWage company) {

        int workingHours = 0;
        int workingDays = 0;
        while (workingHours < company.workingHoursPerMonth && workingDays < company.workingDaysPerMonth) {

            // UC 13
            int dailyWage = dailyWage(workingDays);
            company.dailyWageList.add(dailyWage);

            workingHours += EmpWorkingHrs();
            workingDays++;
        }

        int monthlyWage = workingHours * company.wagePerHour;
        return monthlyWage;

    }

    public void display() {
        if (companyEmpWageList.size() == 0)
            System.out.println("CompanyList is empty");
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            System.out.println("---- company " + (i + 1) + " : -----");
            companyEmpWageList.get(i).displayCompanyDetails();
        }
    }
}
