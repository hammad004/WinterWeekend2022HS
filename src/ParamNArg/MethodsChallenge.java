package ParamNArg;

public class MethodsChallenge {
    public static void main(String[] args) {
        add();
        subtract();
        divide();
        multiply();
    }

    public static void multiply() {
        int a = 10;
        int b = 2;
        System.out.println(a * b);

    }
    public static int divide() {
        int c = 100;
        int d = 2;
        System.out.println(c / d);
        return c;
    }
    public static void add() {
        int e = 50;
        int f = 25;
        System.out.println(e + f);

    }
    public static void subtract() {
        int g = 55;
        int h = 5;
        System.out.println(g - h);
    }
}
