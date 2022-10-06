public class day4Emp_UC_3 {

    public static void main(String args[])
    {
        int pt = 1;
        int ft = 2;
        int wagePerHour = 20;
        int emp = (int)(Math.random()*100)%3;
        int workingHour = 0;
        if (emp == ft)
        {
            System.out.println(" Employee is present and is working for full-time period. ");
            workingHour = 8;
        } else if (emp == pt)
        {
            System.out.println(" Employee  is present and is working for part-time period.");
            workingHour = 4;
        } else
        {
            System.out.println("Employee is absent");
        }
        int wage = workingHour*wagePerHour;
        System.out.println("Daily Employee Wage="+ wage);
    }

}
