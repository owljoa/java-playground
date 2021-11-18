package sandwich.code;

import java.util.EnumSet;
import java.util.Set;

public enum Source {
  HOT_CHILI, SWEET_CHILI, SWEET_ONION, SALT, PEPPER, EXTRA_VIRGIN_OLIVE_OIL;

  public static final Set<Source> DEFAULT_SOURCE_SET = EnumSet.of(Source.SALT, Source.PEPPER,
    Source.EXTRA_VIRGIN_OLIVE_OIL);
}
