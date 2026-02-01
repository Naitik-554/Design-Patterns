package Factory;

public class EmployeeFactory {

    public static Employee getEmployee(String position) {
        if(position.trim().equals("Web Developer")) {
            return new WebDeveloper();
        }
        else if(position.trim().equals("Android Developer")) {
            return new AndroidDeveloper();
        }
        else return null;
    }

}
