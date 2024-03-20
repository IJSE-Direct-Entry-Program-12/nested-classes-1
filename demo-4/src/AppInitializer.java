public class AppInitializer {

    public static void main(String[] args) {
        Object o = new Object(){
            int id;
            String name;

            void print(){
                System.out.println("print()");
            }

            public String toString(){
                return "IJSE";
            }
        };
        System.out.println(o);
    }
}


