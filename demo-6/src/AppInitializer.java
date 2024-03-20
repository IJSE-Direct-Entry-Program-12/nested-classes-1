public class AppInitializer {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1, "Kasun"),
            new Employee(2, "Nuwan"),
            new Employee(3, "Supun"){
                public void print(){
                    System.out.printf("id=%s, name=%s, pos=manager\n", id, name);
                }
            },
            new Employee(4, "Ruwan"),
            new Employee(5, "Upul")
        };
        for (Employee employee : employees) {
            employee.print();
        }
    }
}
class Employee {
    int id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void print(){
        System.out.printf("id=%s, name=%s \n", id, name);
    }
}
//class Manager extends Employee {
//    public Manager(int id, String name) {
//        super(id, name);
//    }
//    public void print(){
//        System.out.printf("id=%s, name=%s, pos=manager\n", id, name);
//    }
//}