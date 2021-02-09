package com.bek.stats;

import java.util.*;

public class RatingAnalyzer implements org.stats.RatingAnalyzer {
    private int[] ratings;

    public RatingAnalyzer(int[] ratings) {
        this.ratings = ratings;
    }

    @Override
    public double mean() {
        double sum = 0.0;
        double size = ratings.length;
        for (int i = 0; i < size; i++) {
            sum += ratings[i];
        }
        return sum / size;
    }

    @Override
    public double median() {
        List<Integer> list = new ArrayList<>();
        double value = 0.0;

        for (int i = 0; i < ratings.length; i++) {
            list.add(ratings[i]);
        }
        list.sort(null);
        int index = list.size() / 2;
        if (list.size() % 2 != 0) {
            value = list.get(index);
        } else {
            value = (list.get(index) + list.get(index - 1)) / 2.0;
        }
        return value;
    }

    @Override
    public int[] mode() {
        int[] mode = {};
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

        return mode;
    }
}