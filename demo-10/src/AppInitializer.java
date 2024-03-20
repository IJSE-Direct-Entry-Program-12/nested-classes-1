public class AppInitializer {

    public static void main(String[] args) {
        Fn myFn = (x, y) -> x * x + y * y;
        //Gn myGn = (a, b) -> myFn.execute(a, b);
        Gn myGn = myFn::execute;
    }
}

interface Fn {
    int execute(int x, int y);
}

interface Gn{
    int process(int a, int b);
}