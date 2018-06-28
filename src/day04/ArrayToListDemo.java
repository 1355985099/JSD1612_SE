package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * Arrays提供了静态方法asList.
 * @author adminitartor
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four"};
		
		System.out.println(Arrays.toString(array));
		
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		/*
		 * 对集合元素的操作就是对原数组对应元素
		 * 的操作.
		 */
		list.set(2, "3");
		System.out.println("list:"+list);
		System.out.println("array:"+Arrays.toString(array));
		
		/*
		 * 由于添加元素会导致数组扩容,所以该操作
		 * 不受支持
		 */
//		list.add("five");
		/*
		 * 若想添加新元素,需要自行创建一个集合
		 */
		List<String> list1 
			= new ArrayList<String>(list);
//		list1.addAll(list);
		System.out.println("list1:"+list1);
		list1.add("five");
		System.out.println("list1:"+list1);
	}
}










