package com.core.collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class HashMapExcercises {
    public static void main(String[] args) {
        collision();

    }

    private static void collision(){

        HashMap<String, String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("key1", "value1");
        stringStringHashMap.put("key1", "value2");
        stringStringHashMap.put("key2", "value3");
        System.out.println(stringStringHashMap);

        String key1 = stringStringHashMap.get("key1");
        System.out.println(key1);

        boolean value1 = stringStringHashMap.containsValue("value2");
        System.out.println(value1);

        Hashtable<String, String> stringStringHashtable = new Hashtable<String, String>();
        stringStringHashtable.put("key1", "value1");
        stringStringHashtable.put("key1", "value2");
        stringStringHashtable.put("key2", "value3");
        System.out.println(stringStringHashtable);

    }
}
