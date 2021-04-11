package com.geek.algorithm.light.Algorithm.solution;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class DequeLinkedNode {
        int key;
        int value;
        DequeLinkedNode prev;
        DequeLinkedNode next;
        public  DequeLinkedNode(){};
        public DequeLinkedNode(int newKey, int newValue) {
            this.key = newKey;
            this.value = newValue;
        }

    }
    private int size;
    private int capacity;
    private Map<Integer, DequeLinkedNode> cache = new HashMap<>();
    private DequeLinkedNode head,tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = new DequeLinkedNode();
        this.tail = new DequeLinkedNode();
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        DequeLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        removeToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DequeLinkedNode node = cache.get(key);
        if (node == null) {
            node = new DequeLinkedNode(key, value);
            addToHead(node);
            cache.put(key, node);
            ++size;
            if (size > capacity) {
                DequeLinkedNode tail = removeTail();
                cache.remove(tail.key);
                --size;
            }
        } else {
            node.value = value;
            removeToHead(node);
        }
    }

    private void removeNode(DequeLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(DequeLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeToHead(DequeLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private DequeLinkedNode removeTail() {
        DequeLinkedNode node = tail.prev;
        removeNode(node);
        return node;
    }
}
