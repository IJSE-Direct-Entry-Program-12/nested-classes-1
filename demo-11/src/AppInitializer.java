public class AppInitializer {

    public static void main(String[] args) {
        //MyFun fn1 = x -> System.out.println(x);
        MyFun fn1 = System.out::println;
        fn1.doSomething("IJSE");
        //System.out.println("IJSE");
    }
}

interface MyFun {
    void doSomething(String x);
}
