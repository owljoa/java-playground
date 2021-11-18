package sandwich.code;

import java.util.EnumSet;
import java.util.Set;

public enum Topping {
  ALL, LETTUCE, CUCUMBER, PICKLE, OLIVE, JALAPENO, TOMATO, PIMENTO;

  public static final Set<Topping> DEFAULT_TOPPING_SET = EnumSet.of(Topping.ALL);
}
