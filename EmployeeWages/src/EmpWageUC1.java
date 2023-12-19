public class EmpWageUC1 {
    public static void main(String[] args) {

        int empCheck = Math.random() < 0.5 ? 0 : 1;

        if (empCheck == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
