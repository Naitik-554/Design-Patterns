package Abstract_Factory;

public class WebDevFactory extends EmployeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }

}
