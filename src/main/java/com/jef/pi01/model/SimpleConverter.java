package com.jef.pi01.model;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class SimpleConverter {
    public static final Map<Integer, String> unities = Stream.of(new Object[][] {
            {1, "I"}, {2, "II"}, {3, "III"}, {4, "IV"}, {5, "V"}, {6, "VI"}, {7, "VII"}, {8, "VIII"}, {9, "IX"},
    }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));

    public static final Map<Integer, String> tens = Stream.of(new Object[][] {
            {1, "X"}, {2, "XX"}, {3, "XXX"}, {4, "XL"}, {5, "L"}, {6, "LX"}, {7, "LXX"}, {8, "LXXX"}, {9, "XC"},
    }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));

    public static final Map<Integer, String> hundreds = Stream.of(new Object[][] {
            {1, "C"}, {2, "CC"}, {3, "CCC"}, {4, "CD"}, {5, "D"}, {6, "DC"}, {7, "DCC"}, {8, "DCCC"}, {9, "CM"},
    }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));

    public static final Map<Integer, String> thousands = Stream.of(new Object[][] {
            {1, "M"}, {2, "MM"}, {3, "MMM"}
    }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));
}
