public class Day4Emp_UC_2 {

    public static void main(String args[])
    {
        int ft = 1;
        int wagePerHour = 20;
        int emp = (int)(Math.random()*100)%2;
        int workingHour= 0;
        if (emp == ft)
        {
            System.out.println("employee present");
            workingHour = 8;
        } else
        {
            System.out.println("employee absent");
        }
        int wage = workingHour*wagePerHour;
        System.out.println("daily employee wage=" + wage);
    }
}
