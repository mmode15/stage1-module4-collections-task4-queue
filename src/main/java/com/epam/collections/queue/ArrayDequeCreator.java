package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        result.addLast(firstQueue.poll());
        result.addLast(firstQueue.poll());
        result.addLast(secondQueue.poll());
        result.addLast(secondQueue.poll());

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(result.pollLast());
            result.addLast(firstQueue.poll());
            result.addLast(firstQueue.poll());
            secondQueue.add(result.pollLast());
            result.addLast(secondQueue.poll());
            result.addLast(secondQueue.poll());
        }
        return result;
    }
}
