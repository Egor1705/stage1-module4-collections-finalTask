package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {

            if (e.getValue().contains(developer)) {
                list.add(e.getKey());
            }

        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).length() == list.get(j).length()) {
                    //System.out.println("dup");
                    Collections.sort(list, new newComparator());
                }


            }
        }
        return list;
    }
}
        class newComparator implements Comparator<String> {

            @Override
            public int compare(String o1, String o2) {
                int result = o1.compareTo(o2);
                if (o1.length() == o2.length()) {
                    result = 0;
                }
                return result;
            }
        }
