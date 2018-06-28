package day04;

import java.util.Collection;
import java.util.HashSet;

/**
 * 集合转换为数组
 * Collection提供了方法toArray可以将当前
 * 集合转换为一个数组
 * @author adminitartor
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c
			= new HashSet<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		
		System.out.println(c);
		//该方法不常用
//		Object[] array = c.toArray();
		
		String[] array 
			= c.toArray(new String[c.size()]);
		System.out.println("len:"+array.length);
		for(String str : array){
			System.out.println(str);
		}
		
	}
}




