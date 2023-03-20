package org.example.play;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class PlayStreams {


    public static void main(String[] args) {


//        Function<String,Integer> keyMapper = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        };

//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length()%2==0;
//            }
//        };

Map<Boolean,List<String>> collectWordsSameLength = new HashMap<>();
        try
        { String myFile = new String(Files.readAllBytes(Paths.get("/users/leste/basicsstrong/documents/mytestdir/lifeonmars.txt")),StandardCharsets.UTF_8);
            List<String> words = List.of(myFile.split("\\PL+"));

//            remove spaces

            String myNoSpaceString = myFile.replaceAll("[^A-Za-z]","");
            Map<Character,Long> myMap = myNoSpaceString.chars()
                    .mapToObj(x->(char) x)
                    .collect(Collectors.groupingBy(Function.identity(),counting()));
            System.out.println(myMap);

            List<Character> dupes = myMap.entrySet().stream()
                    .filter(x->x.getValue()==2)
                    .map(Map.Entry::getKey)
                    .toList();

            long s1 = words
                    .stream()
                    .distinct()
                    .count();
            System.out.println(s1);

            collectWordsSameLength = words.stream()
                    .distinct()
                    .sorted(String::compareTo)
                    .collect(Collectors.partitioningBy(s->s.length()%2==0));
            System.out.println("wait here");
        } catch (Exception e)

        {
            System.out.println(e.getMessage());
        }

        collectWordsSameLength.entrySet().stream().forEach(System.out::println);

    }

}
