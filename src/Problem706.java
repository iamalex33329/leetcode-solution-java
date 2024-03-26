/**
 *  706. Design HashMap
 *
 *  Design a HashMap without using any built-in hash table libraries.
 *
 *  Implement the MyHashMap class:
 *
 *  - MyHashMap() initializes the object with an empty map.
 *
 *  - void put(int key, int value) inserts a (key, value) pair into
 *    the HashMap. If the key already exists in the map, update the
 *    corresponding value.
 *
 *  - int get(int key) returns the value to which the specified key is
 *    mapped, or -1 if this map contains no mapping for the key.
 *
 *  - void remove(key) removes the key and its corresponding value if
 *    the map contains the mapping for the key.
 *
 */

import java.util.Arrays;

public class Problem706 {

    class MyHashMap {

        private long[] map;

        private final long size = 100000;
        private final long mul = 1439;

        public MyHashMap() {
            map = new long[(int) size];
            Arrays.fill(map, -1);
        }

        private int hash(int key) {
            return (int) ((key * mul) % size);
        }

        public void put(int key, int value) { map[hash(key)] = value; }

        public int get(int key) { return (int) map[hash(key)]; }

        public void remove(int key) { map[hash(key)] = -1; }
    }
}
