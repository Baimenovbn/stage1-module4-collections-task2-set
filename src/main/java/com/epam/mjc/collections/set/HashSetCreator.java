package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();

        sourceList.forEach(el -> {
            int copy = el;

            if (copy % 2 == 0) {
                do {
                    result.add(copy);
                    copy /= 2;
                } while(copy % 2 == 0);
                result.add(copy);
            } else {
                result.add(el);
                result.add(el * 2);
            }
        });

        return result;
    }
}
