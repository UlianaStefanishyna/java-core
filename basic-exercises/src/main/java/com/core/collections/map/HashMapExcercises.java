//package com.core.collections.map;
//
//import lombok.AllArgsConstructor;
//
//import java.util.HashMap;
//import java.util.Objects;
//
//public class HashMapExcercises {
//    public static void main(String[] args) {
//        collision();
//    }
//
//    private static void collision() {
//
//        HashMap<Key, String> stringStringHashMap = new HashMap<>();
//
//        Key key1 = new Key(1, "name1");
//        Key key2 = new Key(1, "name2");
//
//        stringStringHashMap.put(key1, "value1");
//        stringStringHashMap.put(key2, "value2");
//        stringStringHashMap.put(new Key(2, "name3"), "value3");
////        System.out.println(stringStringHashMap);
//
//        String res = stringStringHashMap.get(key2);
//        System.out.println(res);
////
////        boolean value1 = stringStringHashMap.containsValue("value2");
////        System.out.println(value1);
////
////        Hashtable<String, String> stringStringHashtable = new Hashtable<String, String>();
////        stringStringHashtable.put("key1", "value1");
////        stringStringHashtable.put("key1", "value2");
////        stringStringHashtable.put("key2", "value3");
////        System.out.println(stringStringHashtable);
//
//    }
//
//    @AllArgsConstructor
//    private static class Key {
//        long id;
//        String key;
//
//        @Override
//        public boolean equals(Object o) {
//            System.out.println("equals invoked - key = " + key);
//            if (this == o) return true;
//            if (!(o instanceof Key)) return false;
//            Key key1 = (Key) o;
//            return id == key1.id &&
//                    Objects.equals(key, key1.key);
//        }
//
//        @Override
//        public int hashCode() {
//            System.out.println("hashCode invoked - id = " + this.id);
//            return Objects.hash(id);
//        }
//    }
//}
