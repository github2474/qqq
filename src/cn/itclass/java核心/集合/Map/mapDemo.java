package cn.itclass.java核心.集合.Map;

/*
* Map父接口
* 特点：存储一对数据（key-value），无序，无下标，键不可重复，值可重复
* 方法：
*  V put(K key,V value)  //将对象存进集合中，关联键值。key重复则覆盖原值。
*  Object get(Object key) //根据键获取对应的值
*  Set<K> keySet<K>   //返回所有key
*  Collection<V> values() //返回所有值的Collections集合
*  Set<Map.Entry<K,V>> //键值匹配的Set集合
*
* */

import java.util.HashMap;
import java.util.Map;

public class mapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("cn","中国");
        map.put("uk","英国");
        map.put("us","美国");
        //map.put("cn","zg");   后面替换前面

        System.out.println(map);

        //2
        //map.remove("us");
        System.out.println(map);
        //3 遍历
        //3.1使用keySet
        System.out.println("---keySet()---");
        for (String s : map.keySet()) {
            System.out.println(s+"="+ map.get(s));
        }
        //3.2使用entrySet   效率更高
        System.out.println("---entrySet---");//entry<k,v> 是map的内部类
        for (Map.Entry<String, String> sse : map.entrySet()) {
            System.out.println(sse);
        }

        //判断
        System.out.println(map.containsKey("cn"));

    }
}
