package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> result = new ArrayList<>();

        for ( Map.Entry<String, Set<String> > e : projects.entrySet() ) {
            Set<String> developers = e.getValue();
            if ( developers.contains( developer ) ) {
                result.add( e.getKey() );
            }
        }

        Comparator<String> comparator = (str1, str2) -> {
            if (str1.length() == str2.length()) {
                return str2.compareTo(str1);
            }
            return str2.length() - str1.length();
        };

        result.sort(comparator);

        return result;
    }
}
