package user.impl;

import user.User;

public class GeneralUser implements User {

  private Integer id;
  private String name;

  public GeneralUser(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public void sleep() {
    System.out.println("general user - sleep");
  }

  @Override
  public void readBook() {
    System.out.println("general user - read book");
  }
}
