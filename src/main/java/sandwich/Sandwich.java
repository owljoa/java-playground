package sandwich;

import java.util.EnumSet;
import java.util.Set;

public class Sandwich {

  private static final Cheese DEFAULT_CHEESE = Cheese.AMERICAN;
  private static final Set<Topping> DEFAULT_TOPPING_SET = EnumSet.of(Topping.ALL);
  private static final Set<Source> DEFAULT_SOURCE_SET = EnumSet.of(Source.SALT, Source.PEPPER,
    Source.EXTRA_VIRGIN_OLIVE_OIL);

  public enum Title {TURKEY, STAKE_AND_CHEESE, VEGE, HAM, MEAT_BALL}

  public enum Bread {WHITE, WHEAT, HONEY_OAT, FLAT_BREAD, HEARTY_ITALIAN, PARMESAN_OREGANO}

  public enum Cheese {AMERICAN, SHRED, MOZZARELLA}

  public enum Topping {ALL, LETTUCE, CUCUMBER, PICKLE, OLIVE, JALAPENO, TOMATO, PIMENTO}

  public enum Source {HOT_CHILI, SWEET_CHILI, SWEET_ONION, SALT, PEPPER, EXTRA_VIRGIN_OLIVE_OIL}

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
