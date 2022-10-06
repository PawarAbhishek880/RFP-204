public class Day4Emp_uc_5 {

    public static void main(String args[])
    {
        final int pt = 1;
        final int ft = 2;
        final int wagePerHour = 20;
        final int workingHour = 20;
        int day;

        int totalWage = 0;
        for ( day = 1 ; day <= workingHour ; day++ )
        {
            int emp = (int) (Math.random() * 100) % 3;
            int workingHours =0;
            switch (emp)
            {
                case ft:
                    workingHours = 8;
                    break;
                case pt:
                    workingHours = 4;
                    break;
                default:
            }
            int wage = workingHours*wagePerHour;
            System.out.println("Day " + day + " wage is:" + wage);
            totalWage += wage;
        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}
