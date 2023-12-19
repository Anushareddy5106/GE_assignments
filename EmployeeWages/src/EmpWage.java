public class EmpWage {

    public static void main(String[] args) {

        // UC1
        int empCheck = Math.random() < 0.5 ? 0 : 1;

        if (empCheck == 1)
            System.out.println("Employee is Present");
        else{
            System.out.println("Employee is Absent");
            return;
        }

        // UC2 && UC3
        int WAGE_PER_HOUR = 20;

        int empWage = 0;
        int empHour = 0;
        int isFullTime = Math.random() < 0.5 ? 0 : 1;
        if (empCheck == 1) {
           if (isFullTime == 0) {
                System.out.println("Part Time Employee");
                empHour = 4;
            }
            else{
                System.out.println("Full Time Employee");
                empHour = 8;
            }
            
        }

        empWage = empHour * WAGE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);


    }
}
