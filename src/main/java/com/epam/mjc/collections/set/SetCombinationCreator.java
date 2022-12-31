package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> result = new HashSet<>();

        Consumer<String> consumer = el -> {
            if (firstSet.contains(el) && secondSet.contains(el) && !thirdSet.contains(el)) {
                result.add(el);
            } else if (!firstSet.contains(el) && !secondSet.contains(el) && thirdSet.contains(el)) {
                result.add(el);
            }
        };

        firstSet.forEach(consumer);
        secondSet.forEach(consumer);
        thirdSet.forEach(consumer);


        return result;
    }
}
