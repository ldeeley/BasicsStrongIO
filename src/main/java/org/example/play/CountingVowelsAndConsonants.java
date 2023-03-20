package org.example.play;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountingVowelsAndConsonants {

    public enum vowelsEnum { a, e, i, o, u}

    public static void main(String[] args) {

        String testString = "count the number of vowels and consonants in this sentence";

        Optional<Map.Entry<Character, Long>> collect = testString.chars()
                .mapToObj(x -> (char) x)
                .filter(x-> !x.equals(' '))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                        .entrySet()
                                .stream()
                                        .max(Map.Entry.comparingByValue());

        collect.ifPresent(System.out::print);

//        Predicate<Character> isAVowel = new Predicate<Character>() {
//            @Override
//            public boolean test(Character character) {
//                return "aeiouAEIOU".indexOf(character)!=-1;
//            }
//        };
//
//        Map<Boolean, Long> collect = testString.chars()
//                .mapToObj(x -> (char) x)
//                .collect(Collectors.partitioningBy(isAVowel,Collectors.counting()));



        System.out.println("wait here");

    }

}
