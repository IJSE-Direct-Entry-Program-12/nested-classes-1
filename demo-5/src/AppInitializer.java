public class AppInitializer {

    public static void main(String[] args) {
        new MyInterface(){
            {
                System.out.println("You can put you initialization logic here");
            }
            int x = 10;
            public void myMethod1() {
                System.out.println("myMethod1");
            }
            public void myMethod2() {
                System.out.println("myMethod2");
            }
            public void myMethod3(){
                System.out.println("myMethod3");
            }
        }.myMethod3();

    }
}
interface MyInterface{
    void myMethod1();
    void myMethod2();
}
