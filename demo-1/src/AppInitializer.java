public class AppInitializer {

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.id = 1;
        c1.name = "Kasun";
        c1.address = "Galle";
        c1.printDetails();
        new Customer();
        new Customer();
        new Customer();
        new Customer();
        new Customer();
        new Customer();
        new Customer();
    }
}

class Customer extends Object{
    int id;
    String name;
    String address;

    void printDetails(){
        System.out.printf("id=C%03d, name=%s, address=%s \n", id, name, address);
    }
}
