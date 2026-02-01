package Abstract_Factory;

public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        return 80000;
    }

    @Override
    public String name() {
        System.out.println("Web Developer");
        return "I am Web Developer";
    }

}
