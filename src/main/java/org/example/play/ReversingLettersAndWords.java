package org.example.play;

import java.util.List;
import java.util.function.Function;

public class ReversingLettersAndWords {

    private static String revWord(String string){
        return new StringBuilder(string).reverse().toString();
    }
    public static void main(String[] args) {

        String testString = "find the first nonrecurring character, and it's position";

        String[] words = testString.split(" ");

        StringBuilder stringBuilder = new StringBuilder("");

        for (String str : words){
            stringBuilder.insert(0,revWord(str)+" ");
        }

        System.out.println(stringBuilder.toString().trim());

    }


}
