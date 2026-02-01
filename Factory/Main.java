package Factory;

public class Main {

    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee("Web Developer");
        String name = e1.name();
        System.out.println(name);
    }
}
