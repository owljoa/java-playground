import java.util.EnumSet;
import java.util.List;
import sandwich.Sandwich;
import sandwich.Sandwich.Bread;
import sandwich.Sandwich.Cheese;
import sandwich.Sandwich.Source;
import sandwich.Sandwich.Title;
import sandwich.Sandwich.Topping;

public class MainApplication {

  public static void main(String[] args) {

    System.out.println("Hello World");

    System.out.println("Sandwiches by Telescoping Constructor Pattern: "
      + makeSandwichesWithTelescopingConstructorPatten());
  }

  private static List<Sandwich> makeSandwichesWithTelescopingConstructorPatten() {
    // 점층적 생성자 패턴(telescoping constructor pattern)
    // 샌드위치 생성자 호출
    Sandwich myTurkeySandwich = new Sandwich(Title.TURKEY, Bread.FLAT_BREAD);
    Sandwich yourHamSandwich = new Sandwich(Title.HAM, Bread.WHITE, Cheese.SHRED);
    Sandwich ourSandwich = new Sandwich(Title.TURKEY, Bread.WHITE, Cheese.AMERICAN, true,
      EnumSet.of(
        Topping.LETTUCE, Topping.OLIVE, Topping.TOMATO),
      EnumSet.of(Source.SWEET_ONION, Source.HOT_CHILI));

    return List.of(myTurkeySandwich, yourHamSandwich, ourSandwich);
  }
}