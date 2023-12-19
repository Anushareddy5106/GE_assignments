public class EmpWage {

    public static void main(String[] args) {

        // UC1
        int empCheck = Math.random() < 0.5 ? 0 : 1;

        if (empCheck == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

        // UC2
        int WAGE_PER_HOUR = 20;

        int empWage = 0;
        int empHour = 0;

        if (empCheck == 1) {
            empHour = 8;
        }
        empWage = empHour * WAGE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);

    }
}
