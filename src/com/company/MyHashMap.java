package com.company;

import java.util.Arrays;

class MyHashMap {
    int[] map;

    public MyHashMap() {
        map = new int[10];
        for (int i = 0; i < map.length; i++) {
            map[i] = -1; // set all values to -1 to denote unallovated
//            System.out.println(map[i]);
        }

    }

    public void put(int key, int value) {
        map[key] = value;

    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(map);
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(2,4);
        map.put(5,6);
        map.put(1,4);
        map.put(7,9);

        System.out.println(map.toString());

    }
}


