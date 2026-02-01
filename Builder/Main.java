package Builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("id123")
                .setUserName("Naitik")
                .setEmailId("naitik@gmail.com")
                .build();

        System.out.println(user.toString());
    }
}
