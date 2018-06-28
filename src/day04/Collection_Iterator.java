package day04;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * 遍历集合使用统一的方式:迭代器模式
 * Iterator iterator()
 * 集合提供的该方法可以获取一个可供遍历当前集合的
 * 迭代器实现类.
 * 
 * 
 * @author adminitartor
 *
 */
public class Collection_Iterator {
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		System.out.println(c);
		c.add("four");
		System.out.println(c);
		Iterator<String> it = c.iterator();
		/*
		 * boolean hasNext()
		 * 该方法是用来判断集合中是否还有
		 * 元素可以遍历出来
		 */
		while(it.hasNext()){
			/*
			 * E next()
			 * 获取下一个元素
			 */
			String str = (String)it.next();
			System.out.println(str);
			if("#".equals(str)){
				//迭代器遍历时不要通过集合方法删元素
//				c.remove(str);
				it.remove();
			}
		}
		System.out.println(c);
	}
}
