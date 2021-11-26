package user;

public interface User {

  void sleep();

  void readBook();

  default void sayHello() {
    System.out.println("Hello User!");
  }
}
