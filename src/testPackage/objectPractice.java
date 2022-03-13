package testPackage;

public class objectPractice {
    public static void main(String[] args) {
        int age = 20;
        objectPractice obj = new objectPractice(); {

        }
        Cat romeo = new Cat();
        romeo.name = "romeo";
        romeo.age = 2;
        romeo.hasFur = true;
        romeo.color = "gray";
        romeo.gender = "male";

        Cat rex = new Cat();
        rex.name = "rex";
        rex.gender = "male";
        rex.color = "orange";
        rex.hasFur = true;
        rex.age = 5;

        System.out.println(romeo.name);
        System.out.println(rex.name);


    }
}
