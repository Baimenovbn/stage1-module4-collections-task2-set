package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> tree = sourceList.stream()
                                        .map(el -> el * el)
                                        .collect(Collectors.toCollection(TreeSet::new));

        return tree.subSet(lowerBound, true, upperBound, true);
    }
}
