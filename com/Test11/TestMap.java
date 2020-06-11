package com.Test11;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * Collection接口
 *
 * Map接口
 *    |----HashMap:Map的主要实现类
 *    |----LinkHashMap:使用链表维护添加进Map的顺序。故遍历Map时，是按添加顺序遍历的。
 *    |----TreeMap:按照添加进Map中的元素的key的指定属性进行排序
 *                 要求：key必须是按照同一个类的对象！
 *                 针对key:自然排序 VS 定制排序
 *    |----Hashtable:
 *       |----Properties:
 */
public class TestMap {
    // 定制排序
    public void test5() {
        Comparator com = new Comparator() {
            // 向TreeSet中添加Customer类的对象，在此compare（）方法中，指明是按照Cutomer的哪一个属性排序的
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Customer && o2 instanceof Customer) {
                    Customer c1 = (Customer) o1;
                    Customer c2 = (Customer) o2;
                    // return c1.getID().compareTo(c2.getID());//按照id排序
                    int i = c1.getID().compareTo(c2.getID());
                    if (i == 0) {
                        return c1.getName().compareTo(c2.getName());
                    } else {
                        return i;
                    }
                }
                return 0;
            }
        };

        TreeMap map = new TreeMap(com);
        map.put(new Customer("AA", 103), 14);
        map.put(new Customer("CC", 003), 24);
        map.put(new Customer("BB", 03), 22);
        map.put(new Customer("GG", 1203), 44);
        Set set1 = map.keySet();
        for (Object object : set1) {
            System.out.println(object + ">>>>>>>>>" + map.get(object));
        }

    }

    // 自然排序
    @Test
    public void test4() {
        Map map = new TreeMap();
        map.put(new Person("AA", 22), 42);
        map.put(new Person("MM", 23), 52);
        map.put(new Person("GG", 13), 12);
        map.put(new Person("JJ", 24), 22);
        Set set1 = map.keySet();
        for (Object object : set1) {
            System.out.println(object + ">>>>>>>>>" + map.get(object));
        }
    }

    @Test
    public void test3() {
        Map map = new LinkedHashMap();
        map.put("AA", 213);
        map.put("BB", 213);
        map.put(123, "CC");
        map.put(new Person("DD", 23), 89);
        Set set1 = map.keySet();
        for (Object object : set1) {
            System.out.println(object + ">>>>>>>>>" + map.get(object));
        }
    }

    /*
     * Set keySet() Collection values() Set entrySet()
     */
    @Test
    public void test2() {
        Map map = new HashMap();
        map.put("AA", 213);
        map.put("BB", 213);
        map.put(123, "CC");
        map.put(new Person("DD", 23), 89);

        // 1.遍历key值
        Set set = map.keySet();
        for (Object object : set) {
            System.out.println(object);
        }
        System.out.println("************");
        // 2.遍历value的值
        Collection values = map.values();
        Iterator i = values.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());

        }

        // 3.遍历key——value对
        // 方式一：
        Set set1 = map.keySet();
        for (Object object : set1) {
            System.out.println(object + ">>>>>>>>>" + map.get(object));
        }
        // 方式二：
        Set set2 = map.entrySet();
        for (Object object : set2) {
            Map.Entry entry = (Map.Entry) object;
            System.out.println(entry + ">>>>>>>>>" + map.get(entry));
            // System.out.println(entry);

        }
    }
    /*
     * Object put(Object key,Object value) :向map中添加一个元素 Object remove(Object
     * key)：按照指定的key删除此value void putAll(Map t) void clear() Object get(Object key)
     * :获取指定的key的value值，若无此key，则返回null boolean containsKey(Object key) boolean
     * containsValue(Object value) int size() boolean isEmpty() boolean
     * equals(Object obj)
     *
     * HashMap： 1：key勇set来存放，不可以重复 ，value是用collection来存放，可以重复
     * 一个key-value对，是一个entry，所有的entry是用set存放的 也是不可以重复的。
     *
     * 2：向HashMap中添加元素时，会调用key所在类的equal（）的方法，判断两个key是否相等 若相同则添加后面添加的那个元素的key
     */

    @Test
    public void test1() {
        Map map = new HashMap();
        map.put("AA", 213);
        map.put("BB", 213);
        map.put("BB", 213);// 存不进去
        map.put("BB", 45);// 也存不进去
        map.put(123, "CC");
        map.put(new Person("DD", 23), 89);
        map.put(new Person("DD", 23), 87);
        map.put(null, null);
        map.remove("BB");
        System.out.println(map.size());
        System.out.println(map);
        // Object value=map.get(1234);
        Object value = map.get(1234);
        System.out.println(value);

    }

}
