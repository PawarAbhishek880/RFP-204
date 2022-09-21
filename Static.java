public class Static {
    static int a = 50;
    static int b = 30;
    static int c = a + b;
    static void fun()
    {
        System.out.println("Static variable sum is : " + c);
    }

    public static void main(String[] args) {
        fun();
    }
}
