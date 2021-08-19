package aluczynska.budgetingprogram.types;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MonthNames {

    MONTH_JANUARY("month.january"),
    MONTH_FEBRUARY("month.february"),
    MONTH_MARCH("month.march"),
    MONTH_APRIL("month.april"),
    MONTH_MAY("month.may"),
    MONTH_JUNE("month.june"),
    MONTH_JULY("month.july"),
    MONTH_AUGUST("month.august"),
    MONTH_SEPTEMBER("month.september"),
    MONTH_OCTOBER("month.october"),
    MONTH_NOVEMBER("month.november"),
    MONTH_DECEMBER("month.december");

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
