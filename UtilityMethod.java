public class UtilityMethod {

    int add(int a, int b) {
        return a + b;
    }

    int sub(int d, int e) {
        return d - e;
    }

    int mul(int g, int h) {
        return g * h;
    }

    int div(int t, int q) {
        return t / q;
    }

    public static void main(String[] args) {
        UtilityMethod obj = new UtilityMethod();

        System.out.println("Addition: " + obj.add(10, 20));
        System.out.println("Subtraction: " + obj.sub(12, 13));
        System.out.println("Multiplication: " + obj.mul(16, 13));
        System.out.println("Division: " + obj.div(10, 5));
    }
}
