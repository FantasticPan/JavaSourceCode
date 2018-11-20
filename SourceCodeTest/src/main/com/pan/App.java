package com.pan;

import java.util.HashMap;

/**
 * Hello world!
 */
public class App {

    static final int MAXIMUM_CAPACITY = 1 << 30;

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public static void main(String[] args) {
        //LinkedList<Integer> list = new LinkedList<>();
        //LinkedList<Integer> list1 = new LinkedList<>();
        //list1.add(10);
        //list.add(1);
        //list.addAll(1, list1);
        //System.out.println(list.size());
        //System.out.println(list.get(1));
        //System.out.println(tableSizeFor(17));
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 1);
        hashMap.put(17, 2);
        hashMap.put(33, 3);
        hashMap.put(49, 4);
        hashMap.put(65, 5);
        hashMap.put(81, 6);
        hashMap.put(113, 7);
        hashMap.put(129, 8);
        //当冲突超过8后，会变成红黑树
        hashMap.put(145, 9);
    }
}
