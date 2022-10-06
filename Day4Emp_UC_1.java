public class Day4Emp_UC_1 {

    public static void main(String args[])
    {

        int ft = 1;
        int emp = (int)(Math.random()*100)%2;
        if (emp == ft)
        {
            System.out.println("Employee is present ");
        } else
        {
            System.out.println("Employee is absent ");
        }
    }

}
