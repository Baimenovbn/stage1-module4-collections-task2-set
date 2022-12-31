package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> firstSecondIntersectionAndNotInThird = new HashSet<>(firstSet);
        firstSecondIntersectionAndNotInThird.retainAll(secondSet);
        firstSecondIntersectionAndNotInThird.removeAll(thirdSet);

        HashSet<String> onlyToThird = new HashSet<>(thirdSet);
        onlyToThird.removeAll(firstSet);
        onlyToThird.removeAll(secondSet);

        firstSecondIntersectionAndNotInThird.addAll(onlyToThird);

        return firstSecondIntersectionAndNotInThird;
    }
}
