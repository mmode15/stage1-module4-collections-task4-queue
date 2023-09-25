package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> mergedList = new ArrayList<>(firstList);
        mergedList.addAll(secondList);
        PriorityQueue<String> result = new PriorityQueue<String>(Collections.reverseOrder());
        result.addAll(mergedList);
        return result;
    }
}
