public class AppInitializer {

    // Concrete Class
    // Not an Abstract Class
    // Not a Sealed Class

    // new -> Not a Final Class (But impossible to extend)
    // enum -> Final Class

    // Inner Class = True
    // Like Local Inner Class But Not A Local Inner Class

    int x;
    {
        int x = 10;
    }

    class InnerClass{
    }
    {
        class LocalInnerClass{

        }
        new Object(){};
    }

    Object o = new Object(){};
    //Object o2 = class LocalInnerClass{};

    public static void main(String[] args) {
        new Object(){};
        new MyClass(1, "Kasun"){};
        new MyInterface(){
            public void print(){}
        };
    }
}

class MyClass{
    MyClass(int id, String name){}
}
interface MyInterface{
    void print();
}

enum MyEnum{
    FIRST(){}, SECOND(){}
}
