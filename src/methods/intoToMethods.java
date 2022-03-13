package methods;

public class intoToMethods {
    public static void main(String[] args) {
        doSomething();
        System.out.println(doSomethingElse());
    }
    static void doSomething() {
        System.out.println("this method is doing soemthing");
    }
    static int doSomethingElse() {
int x = 5;
int y = 10;
        return x + y;

    }


}
