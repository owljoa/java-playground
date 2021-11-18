package sandwich;

import java.util.Set;
import sandwich.code.Bread;
import sandwich.code.Cheese;
import sandwich.code.Source;
import sandwich.code.Title;
import sandwich.code.Topping;

public class SandwichByJavaBeans {

  private Title title; // 필수
  private Bread bread; // 필수
  private Cheese cheese;
  private Boolean heatBread;
  private Set<Topping> topping;
  private Set<Source> source;

  public SandwichByJavaBeans() {
  }

  public void setTitle(Title title) {
    this.title = title;
  }

  public void setBread(Bread bread) {
    this.bread = bread;
  }

  public void setCheese(Cheese cheese) {
    this.cheese = cheese;
  }

  public void setHeatBread(Boolean heatBread) {
    this.heatBread = heatBread;
  }

  public void setTopping(Set<Topping> topping) {
    this.topping = topping;
  }

  public void setSource(Set<Source> source) {
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
