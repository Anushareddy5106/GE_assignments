import java.util.Scanner;

public class Employee {
    private static Scanner scanner = new Scanner(System.in);

    private static final int FULLTIME_HRS = 8;
    private static final int PARTTIME_HRS = 4;

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
    public int monthlyWage(int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {

        int workingHours = 0;
        int workingDays = 0;
        while (workingHours < workingHoursPerMonth && workingDays < workingDaysPerMonth) {
            workingHours += EmpWorkingHrs();
            workingDays++;
        }

        int monthlyWage = workingHours * wagePerHour;
        return monthlyWage;

    }
}
