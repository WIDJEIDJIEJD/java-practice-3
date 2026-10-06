package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static List<List<String>> createAnagram(List<String> words) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : words) {
            String[] letters = word.split("");
            Arrays.sort(letters);

            String key = "";
            for (String letter : letters) {
                key += letter;
            }
            
            if (groups.containsKey(key)) {
                groups.get(key).add(word);
            } else {
                List<String> group = new ArrayList<>();
                group.add(word);
                groups.put(key, group);
            }
        }
        result.addAll(groups.values());
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of(
            "listen",
            "silent",
            "enlist",
            "hello",
            "world",
            "cat",
            "act",
            "tac"
        );

        List<List<String>> result = createAnagram(words);

        System.out.println(result);
        }   
}
