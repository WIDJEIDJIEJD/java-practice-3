package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main3{
    public static Map.Entry<String, Integer> findMostFrequentEntry(List<Map.Entry<String, Integer>> entries){
        Map.Entry<String, Integer> bestEntry = entries.get(0);
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > bestEntry.getValue()) {
                bestEntry = entry;
            }
        }
        return bestEntry;
    }

    public static List<String> countWords(String text, int n){
        List<String> result = new ArrayList<>();
        Map<String, Integer> counter = new LinkedHashMap<>();

        String[] words = text.split(" ");
        for (String word : words) {
            if (counter.containsKey(word)) {
                counter.put(word, counter.get(word) + 1);
            } else {
                counter.put(word, 1);
            }
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            entries.add(entry);
        }

        while (result.size() < n && !entries.isEmpty()) {
            Map.Entry<String, Integer> bestEntry = findMostFrequentEntry(entries);
            result.add(bestEntry.getKey());
            entries.remove(bestEntry);
        }
        return result;
    }
}