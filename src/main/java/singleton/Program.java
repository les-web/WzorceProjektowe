package singleton;

public class Program {

    public static void main(String[] args) {

        Singleton7 singleton1 = Singleton7.SINGLETON;
        Singleton7 singleton11 = Singleton7.SINGLETON;

        System.out.println(singleton1);
        System.out.println(singleton11);

        singleton1.zmienna = 89;
        System.out.println(singleton11.zmienna);
    }
}
