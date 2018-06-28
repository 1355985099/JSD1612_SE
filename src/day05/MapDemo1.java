package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 查找表 常用实现类：HashMap 散列表，哈希表 Map存储元素是以“键值对”的形式存储
 * 其中key不允许重复（equals比较）
 * 
 * @author nijunran
 *
 */
public class MapDemo1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		/**
		 * V put(K k,V v) 
		 * 将给定的key-value对存入到Map中 返回值为被替换的value.
		 * 由于Map不允许有重复的key，
		 * 所以：若存入的值已在Map中，则是替换value,返回值就是被替换的value
		 * 若存入的key在Map中不存在，
		 * 则返回值为NULL
		 */
		Integer value1 = map.put("语文",99);
		System.out.println(value1);
		map.put("数学",98);
		map.put("英语",97);
		map.put("物理",96);
		map.put("化学",99);
		System.out.println(map);
		
		/**
		 * 相同的key是替换value
		 * Map在接收put方法的返回值要注意，若
		 * value是基本类型对应的包装类类型时，
		 * 应当用包装类变量接收，避免自动拆箱，
		 * 否则若返回值为NULL自动拆箱会引发空指针
		 */
		Integer value = map.put("数学", 88);
		System.out.println(map);
		System.out.println(value);
		
		/*
		 * V get(K k)
		 * 根据给定的key获取对应的value
		 */
		value =map.get("语文");
		System.out.println("语文："+value);
		/*		
		 * V remove(K k)
		 * 根据给定的key删除这组键值对
		 * 返回值为该组键值对中的value
		 * 若没有，则返回值为NULL
		 */
		Integer old = map.remove("语文");
		System.out.println(map);
		System.out.println("old:"+old);
		
	}

}
