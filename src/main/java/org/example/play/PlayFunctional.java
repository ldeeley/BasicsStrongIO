package org.example.play;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlayFunctional {

    public static void main(String[] args) {

        String testString = "find the first nonrecurring character, and it's position";
        Map<Character, Long> chs = testString.codePoints()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Character myChar = chs.entrySet().stream()
                .filter(x->x.getValue()==1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse('X');

        System.out.println(" The first non-recurring character is : "+myChar);


    }

}
