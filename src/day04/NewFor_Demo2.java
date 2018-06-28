package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用新循环遍历集合
 * @author adminitartor
 *
 */
public class NewFor_Demo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		for(Object o : c){
			String str = (String)o;
			System.out.println(str);
		}
		
	}
}





