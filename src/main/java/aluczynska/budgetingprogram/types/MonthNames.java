package aluczynska.budgetingprogram.types;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MonthNames {

    MONTH_JANUARY("January"),
    MONTH_FEBRUARY("February"),
    MONTH_MARCH("March"),
    MONTH_APRIL("April"),
    MONTH_MAY("May"),
    MONTH_JUNE("June"),
    MONTH_JULY("July"),
    MONTH_AUGUST("August"),
    MONTH_SEPTEMBER("September"),
    MONTH_OCTOBER("October"),
    MONTH_NOVEMBER("November"),
    MONTH_DECEMBER("December");

    private final String key;

    MonthNames(String key)
    {
        this.key = key;
    }

    public String getKey()
    {
        return key;
    }

//    public static List<String> getLocalizedStrings()
//    {
//        return Stream.of(MonthNames.values())
//                .map(monthName -> Localization.getString(monthName.getKey()))
//                .collect(Collectors.toList());
//    }
}
