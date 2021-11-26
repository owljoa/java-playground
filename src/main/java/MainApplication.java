import user.User;
import user.impl.AdminUser;
import user.impl.GeneralUser;

public class MainApplication {

  public static void main(String[] args) {

    System.out.println("Hello World");

    User adminUser = new AdminUser(1, "Jack");
    User generalUser = new GeneralUser(2, "Kate");

    adminUser.readBook();
    adminUser.sayHello();
    generalUser.readBook();
    generalUser.sayHello();

  }

}