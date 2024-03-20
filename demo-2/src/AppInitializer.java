public class AppInitializer {

    public static void main(String[] args) {
        System.out.println(new Object());
        System.out.println(new Object(){
            int x = 10;
            int y = 20;

            void print(){
                System.out.println(x);
                System.out.println(y);
            }
        });
        System.out.println(new Object(){});
        System.out.println(new Object(){});
        System.out.println(new SuperClass("1", "Kasun"){
            // (){
            //    super("1", "Kasun");
            // }

            // Class Body
        });
        System.out.println(new SuperInterface(){});
    }
}

class SuperClass{
    String id;
    String name;

    SuperClass(String id, String name){
        this.id = id;
        this.name = name;
    }
}
class SubClass extends SuperClass{
    public SubClass(){
        super("1", "Kasun");
    }
}
interface SuperInterface{}
// class NoName implements SuperInterface{}

