public class Day5Emp_UC_7 {

    public static void calculateTotalWage()
    {
        final int pt = 1;
        final int ft = 2;
        final int wagePerHour = 20;
        final int maxWorkingDays = 20;
        final int maxWorkingHours = 100;

        int totalWage = 0;
        int workinghours = 0;
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Working Hours", "Wage", "Total working Hours");
        for (int day = 1, totalworkinghours = 0; day <= maxWorkingDays
                && totalworkinghours < maxWorkingHours; day++, totalworkinghours += workinghours)
        {

            int employee = (int) (Math.random() * 100) % 3;
            switch (employee)
            {
                case ft:
                    workinghours = 8;
                    break;
                case pt:
                    workinghours = 4;
                    break;
                default:
                    workinghours = 0;
                    break;
            }
            int wage = workinghours * wagePerHour;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workinghours, wage, totalworkinghours + workinghours);

        }
        System.out.println("Total wage for a month is " + totalWage);
    }

    public static void main(String args[])
    {
        calculateTotalWage();
    }
}
