import java.util.EnumSet;
import java.util.List;
import sandwich.Sandwich;
import sandwich.SandwichByBuilder;
import sandwich.SandwichByBuilder.SandwichBuilder;
import sandwich.SandwichByJavaBeans;
import sandwich.code.Bread;
import sandwich.code.Cheese;
import sandwich.code.Source;
import sandwich.code.Title;
import sandwich.code.Topping;

public class MainApplication {

  public static void main(String[] args) {

    System.out.println("Hello World");

    System.out.println("Sandwiches by Telescoping Constructor Pattern: "
      + makeSandwichesWithTelescopingConstructorPatten());

    System.out.println("===============================================");
    System.out.println("Sandwiches by Java Beans Pattern: " + makeSandwichesWithJavaBeansPattern());

    System.out.println("===============================================");
    System.out.println("Sandwiches by Builder Pattern: " + makeSandwichesWithBuilderPatten());
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

  private static List<SandwichByJavaBeans> makeSandwichesWithJavaBeansPattern() {
    // 자바 빈즈 패턴(Java Beans Pattern)
    // 기본 샌드위치 생성자 호출 후
    // setter 메소드들을를 이용해서 프로퍼티를 채움으로써 객체 생성 완료
    SandwichByJavaBeans myMeatBallSandwich = new SandwichByJavaBeans();
    myMeatBallSandwich.setTitle(Title.MEAT_BALL);
    myMeatBallSandwich.setBread(Bread.HEARTY_ITALIAN);
    myMeatBallSandwich.setCheese(Cheese.MOZZARELLA);
    myMeatBallSandwich.setHeatBread(true);
    myMeatBallSandwich.setTopping(EnumSet.of(Topping.LETTUCE, Topping.TOMATO));
    myMeatBallSandwich.setSource(EnumSet.of(Source.SALT, Source.HOT_CHILI));

    SandwichByJavaBeans yourStakeAndCheeseSandwich = new SandwichByJavaBeans();
    yourStakeAndCheeseSandwich.setTitle(Title.STAKE_AND_CHEESE);
    yourStakeAndCheeseSandwich.setBread(Bread.HONEY_OAT);
    yourStakeAndCheeseSandwich.setCheese(Cheese.SHRED);
    yourStakeAndCheeseSandwich.setHeatBread(true);
    yourStakeAndCheeseSandwich.setTopping(
      EnumSet.of(Topping.LETTUCE, Topping.PICKLE, Topping.JALAPENO, Topping.TOMATO));
    yourStakeAndCheeseSandwich.setSource(
      EnumSet.of(Source.SALT, Source.PEPPER, Source.EXTRA_VIRGIN_OLIVE_OIL));

    return List.of(myMeatBallSandwich, yourStakeAndCheeseSandwich);
  }

  private static List<SandwichByBuilder> makeSandwichesWithBuilderPatten() {

    SandwichByBuilder mySandwich = new SandwichBuilder(Title.VEGE, Bread.WHEAT)
      .cheese(Cheese.SHRED)
      .heatBread(true)
      .topping(EnumSet.of(Topping.LETTUCE, Topping.PICKLE, Topping.OLIVE))
      .source(EnumSet.of(Source.HOT_CHILI, Source.SWEET_ONION))
      .build();

    SandwichByBuilder yourSandwich = new SandwichBuilder(Title.STAKE_AND_CHEESE, Bread.FLAT_BREAD)
      .cheese(Cheese.MOZZARELLA)
      .heatBread(false)
      .topping(EnumSet.of(Topping.LETTUCE, Topping.CUCUMBER, Topping.JALAPENO))
      .source(EnumSet.of(Source.HOT_CHILI, Source.PEPPER))
      .build();

    return List.of(mySandwich, yourSandwich);
  }
}