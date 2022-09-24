package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer,Set<String>> map = new HashMap<>();

        for(Map.Entry<String,Integer> s:sourceMap.entrySet()){
            for(Set<String>setEl :map.values()){
                if(s.getKey().length()==sourceMap.get(s)){
                    setEl.add(s.getKey());
                }
                map.put(s.getKey().length(),setEl);
            }


        }
        return map;
    }
}
