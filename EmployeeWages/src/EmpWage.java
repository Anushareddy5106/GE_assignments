public class EmpWage {
    static int WAGE_PER_HOUR = 20;

    // UC2 && UC3 daily wage calculation
    public static int hoursPerDay() {

        int empWage = 0;
        int empHour = 0;

        int isFullTime = Math.random() < 0.5 ? 0 : 1;

        if (isPresent() == true) {
            switch (isFullTime) {
                case 1:
                    // System.out.println("Employee is fulltime");
                    empHour = 8;
                    break;

                default:
                    // System.out.println("Employee is parttime");
                    empHour = 4;
                    break;
            }

        }

        empWage = empHour * WAGE_PER_HOUR;
        // System.out.println("Emp Wage: " + empWage);

        return empHour;
    }

    // UC1 && UC4
    public static boolean isPresent() {
        int empCheck = Math.random() < 0.5 ? 0 : 1;

        switch (empCheck) {
            case 1:
                return true;

            default:
                return false;
        }

    }

    public static void main(String[] args) {

        // UC5 monthly wage calculation
        int monthlyWage = 0;
        for (int i = 0; i < 20; i++) {
            monthlyWage += WAGE_PER_HOUR * hoursPerDay();
        }
        System.out.println("Monthly Wage is:" + monthlyWage);

        // UC6
        int days = 0;
        int totalEmpHour = 0;
        int monthlyWageUC6 = 0;
        while (days <= 20 && totalEmpHour <= 100) {
            monthlyWageUC6 += WAGE_PER_HOUR * hoursPerDay();
            totalEmpHour += hoursPerDay();
            days++;
        }

        System.out.println("Monthly Wage for UC6 is:" + monthlyWageUC6);

    }
}
