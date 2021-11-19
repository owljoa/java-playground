package sandwich;

import java.util.Set;
import sandwich.code.Bread;
import sandwich.code.Cheese;
import sandwich.code.Source;
import sandwich.code.Title;
import sandwich.code.Topping;

public class SandwichByBuilder {

  private final Title title; // 필수
  private final Bread bread; // 필수
  private final Cheese cheese;
  private final Boolean heatBread;
  private final Set<Topping> topping;
  private final Set<Source> source;

  public static class SandwichBuilder {

    private final Title title; // 필수
    private final Bread bread; // 필수
    private Cheese cheese = Cheese.DEFAULT_CHEESE;
    private Boolean heatBread = true;
    private Set<Topping> topping = Topping.DEFAULT_TOPPING_SET;
    private Set<Source> source = Source.DEFAULT_SOURCE_SET;

    public SandwichBuilder(Title title, Bread bread) {
      this.title = title;
      this.bread = bread;
    }

    public SandwichBuilder cheese(Cheese cheese) {
      this.cheese = cheese;
      return this;
    }

    public SandwichBuilder heatBread(Boolean heatBread) {
      this.heatBread = heatBread;
      return this;
    }

    public SandwichBuilder topping(Set<Topping> topping) {
      this.topping = topping;
      return this;
    }

    public SandwichBuilder source(Set<Source> source) {
      this.source = source;
      return this;
    }

    public SandwichByBuilder build() {
      return new SandwichByBuilder(this);
    }

  }

  public SandwichByBuilder(SandwichBuilder builder) {
    this.title = builder.title;
    this.bread = builder.bread;
    this.cheese = builder.cheese;
    this.heatBread = builder.heatBread;
    this.topping = builder.topping;
    this.source = builder.source;
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
