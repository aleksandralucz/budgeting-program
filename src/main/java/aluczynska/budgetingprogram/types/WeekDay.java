package aluczynska.budgetingprogram.types;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum WeekDay {

    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday");

    private final String key;

    WeekDay(String key)
    {
        this.key = key;
    }

    public String getKey()
    {
        return key;
    }

//    public static List<String> getLocalizedStrings()
//    {
//        return Stream.of(WeekDay.values())
//                .map(weekDay -> Localization.getString(weekDay.getKey()))
//                .collect(Collectors.toList());
//    }
}
