public class AppInitializer {

    public static void main(String[] args) {
        MyFun[] functions = {
                x -> x * x + 2 * x + 1,
                x -> x * x + 5 * x + 1,
                x -> x * x * x + x * x + 2 * x + x + 1
        };
        for (MyFun fun : functions) {
            System.out.println(fun.execute(5));
        }
    }
}

@FunctionalInterface
interface MyFun {
    public abstract int execute(int x);
    default void doSomething(){}
    static void myMethod(){}
    //void myAbstractMethod();
}

//class Function1 implements MyFun{
//    @Override
//    public int execute(int x) {
//        return x * x + 2 * x + 2;
//    }
//}
//class Function2 implements MyFun{
//    @Override
//    public int execute(int x) {
//        return x * x + 5 * x + 1;
//    }
//}
//class Function3 implements MyFun{
//    @Override
//    public int execute(int x) {
//        return x * x * x + x * x + 2 * x + 1;
//    }
//}
