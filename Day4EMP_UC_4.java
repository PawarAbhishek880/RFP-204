public class Day4EMP_UC_4 {

    public static void main(String args[]) {
        final int pt = 1;
        final int ft = 2;
        int wagePerHour = 20;
        int emp = (int)(Math.random()*100)%3;
        int workingHour =0;
        switch (emp)
        {
            case ft:
                System.out.println("Employee is present and is working for full-time period.");
                workingHour = 8;
                break;
            case pt:
                System.out.println("Employee  is present and is working for part-time period.");
                workingHour = 4;
                break;
            default:
                System.out.println("Employee is absent");
        }
        int wage = workingHour * wagePerHour;
        System.out.println(" Daily Employee Wage = " + wage);
    }
}
