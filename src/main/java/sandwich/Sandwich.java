package sandwich;

import static sandwich.code.Cheese.DEFAULT_CHEESE;
import static sandwich.code.Source.DEFAULT_SOURCE_SET;
import static sandwich.code.Topping.DEFAULT_TOPPING_SET;

import java.util.Set;
import sandwich.code.Bread;
import sandwich.code.Cheese;
import sandwich.code.Source;
import sandwich.code.Title;
import sandwich.code.Topping;

public class Sandwich {
  
  private final Title title; // 필수
  private final Bread bread; // 필수
  private final Cheese cheese;
  private final Boolean heatBread;
  private final Set<Topping> topping;
  private final Set<Source> source;


  public Sandwich(Title title, Bread bread) {
    this(title, bread, DEFAULT_CHEESE);
  }

  public Sandwich(Title title, Bread bread, Cheese cheese) {
    this(title, bread, cheese, true);
  }

  public Sandwich(Title title, Bread bread, Cheese cheese, Boolean heatBread) {
    this(title, bread, cheese, heatBread, DEFAULT_TOPPING_SET);
  }

  public Sandwich(Title title, Bread bread, Cheese cheese, Boolean heatBread,
    Set<Topping> topping) {
    this(title, bread, cheese, heatBread, topping,
      DEFAULT_SOURCE_SET);
  }

  public Sandwich(Title title, Bread bread, Cheese cheese, Boolean heatBread,
    Set<Topping> topping, Set<Source> source) {
    this.title = title;
    this.bread = bread;
    this.cheese = cheese;
    this.heatBread = heatBread;
    this.topping = topping;
    this.source = source;
  }

  @Override
  public String toString() {
    return "Sandwich{" +
      "title=" + title +
      ", bread=" + bread +
      ", cheese=" + cheese +
      ", heatBread=" + heatBread +
      ", topping=" + topping +
      ", source=" + source +
      '}' + "\n";
  }
}
