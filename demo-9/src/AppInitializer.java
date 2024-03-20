public class AppInitializer {

    public static void main(String[] args) {
        Fn fn1 = (a, b, c) -> a * a * a + 2 * a * b + c * c * c;
        Fn fn2 = (a, b, c) -> b * b * b + 2 * a * c + a * a * a;

        System.out.println(fn1.cal(10,20,30));

        MyFn myFn1 = x -> {
            int result = (x * x + 2 * x +1);
            System.out.println(result);
        };
        MyFn myFn2 = x -> {
            int result = 2 * x + 1;
            System.out.println(result);
        };

        myFn2.process(5);
    }
}

interface Fn {
    int cal(int a, int b, int c);
}

interface MyFn{
    void process(int x);
}
