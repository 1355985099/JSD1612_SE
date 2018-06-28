package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * 集合，与数组一样，用来保存一组元素。但其提供了便于操作元素的相关方法
 * 其派生两个接口：
 * java.util.List:可重复集，并且有序
 * java.util.Set:不可重复集。
 * 元素是否重复是依靠自身equals方法的比较结果
 * @author nijunran
 *
 */
public class CollectionDemo1 {
	
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * 返回当前集合中的数量
		 */
		int size = c.size();
		System.out.println(size);
		/*
		 * boolean isEmpty
		 * 判断集合是否为空
		 * 
		 */
		boolean  isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		
		c.remove("one");
		System.out.println(c);
		
		c.clear();
		System.out.println("size:"+c.size());
		System.out.println("isEmpty:"+c.isEmpty());
		
	}
}
