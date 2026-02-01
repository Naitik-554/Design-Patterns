package Abstract_Factory;

public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        return 70000;
    }

    @Override
    public String name() {
        System.out.println("Android Developer");
        return "I am Android Developer";
    }

}
