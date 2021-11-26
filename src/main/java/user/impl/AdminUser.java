package user.impl;

import user.User;

public class AdminUser implements User {

  private Integer id;
  private String name;

  public AdminUser(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public void sleep() {
    System.out.println("admin user - sleep");

  }

  @Override
  public void readBook() {
    System.out.println("admin user - read book");
  }
}
