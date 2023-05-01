public class MethodOverloading {
    static int addNumbers(int a, int b) {
        return a + b;
    }

    static double addNumbers(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = addNumbers(1, 4);
        double c = addNumbers(6.9, 5.1);

        System.out.println(a);
        System.out.println(c);
    }
}