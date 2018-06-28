package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 常用的线程安全API String Builder 不是线程安全的，StringBuffer是线程安全的。
 * 对于集合和Map而言，可以使用Collection提高的静态方法对已有的进行线程安全的转换
 * 
 * @author nijunran
 *
 */
public class SyncAPI {
	public static void main(String[] args) {
		/*
		 * ArrayList,LinkedList 都不是线程安全的
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);
		/*
		 * 将给定的集合转换为一个线程安全的KList集
		 */
		list = Collections.synchronizedList(list);
		System.out.println(list);
		/*
		 * HashSet不是线程安全的
		 */
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
		/*
		 * 将给定的Set集合转换为线程安全的
		 */
		set = Collections.synchronizedSet(set);
		System.out.println(set);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 99);
		System.out.println(map);
		// 将给定的Map转换为线程安全的
		map = Collections.synchronizedMap(map);
		System.out.println(map);
		/*
		 * 对于集合操作而言，线程安全的集合也不对遍历与增删互斥。 所以当使用迭代器遍历集合式，应自行维护与集合增删元素操作见的互斥
		 */

	}
}
