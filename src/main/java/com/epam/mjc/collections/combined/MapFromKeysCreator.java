package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map <Integer , Set<String>> result = new HashMap<>();

        for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            int wl = e.getKey().length();
            String word = e.getKey();

            if (!result.containsKey( wl )) {
                result.put(wl , new LinkedHashSet<>());
                result.get(wl).add(word);
            } else {
                result.get(wl).add(word);
            }
        }
        return result ;
    }
}
