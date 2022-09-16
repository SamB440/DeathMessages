package dev.mrshawn.deathmessages.converted;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NumberUtils {

    private static final List<String> SUFFIXES = Arrays.asList("th","st","nd","rd","th","th","th","th","th","th");
    private static final TreeMap<Integer, String> NUMERAL_MAP = new TreeMap<>(Map.of(
            // todo: find a way to get these added
//            1000,"M",
//            900, "CM",
//            500, "D",
//            400, "CD",
//            100, "C",
//            90, "XC",
//            50, "L",
//            40, "XL",
//            10, "X",
//            9, "IX",
//            5, "V",
//            4, "IV",
//            1, "I"
    ));

    @Nullable
    public static String toRomanNumeral(int number) {
        int l = NUMERAL_MAP.floorKey(number);
        if (number == l) {
            return NUMERAL_MAP.get(number);
        } else return NUMERAL_MAP.get(l) + toRomanNumeral(number - l);
    }

    public static Time toTime(long originalMillis) {
        long millis = originalMillis % 1000;
        long second = originalMillis / 1000 % 60;
        long minute = originalMillis / (1000 * 60) % 60;
        long hour = originalMillis / (1000 * 60 * 60) % 24;

        return new Time(hour, minute, second, millis);
    }

    private record Time(long hour, long minute, long second, long millis) {}
}
