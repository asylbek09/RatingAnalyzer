package com.bek.stats;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Client {
    public static void main(String[] args) {
        int[] ratings = {3, 1, 4, 4, 1, 3, 3, 1, 3, 4, 3, 5, 5, 4, 3, 3};
        int counter = 1;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < ratings.length; i++) {
            if(!map.containsKey(ratings[i])) {
                map.put(ratings[i], counter);
            } else {
                int num = (int) map.get(ratings[i]);
                map.put(ratings[i], counter + num);
            }
        }
        System.out.println(map);
    }
}