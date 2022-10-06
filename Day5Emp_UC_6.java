public class Day5Emp_UC_6 {
    public static void main(String args[])
    {
        final int pt = 1;
        final int ft = 2;
        final int wagePerHour = 20;
        final int maxWorkingDays = 20;
        final int maxWorkingHour = 100;

        int totalWage = 0;
        int workingHour = 0;
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "workinghours", "wage", "Total workinghours");
        for (int day = 1, totalworkinghour = 0; day <= maxWorkingDays
                && totalworkinghour < maxWorkingDays; day++, totalworkinghour += workingHour)
        {

            int employee = (int) (Math.random() * 100) % 3;
            switch (employee)
            {
                case ft:
                    workingHour = 8;
                    break;
                case pt:
                    workingHour = 4;
                    break;
                default:
                    workingHour = 0;
                    break;
            }
            int wage = workingHour * wagePerHour;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHour, wage, totalworkinghour + workingHour);

        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}
