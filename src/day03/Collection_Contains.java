package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e)
 * 判断当前集合是否包含给定元素
 * @author nijunran
 *
 */
public class Collection_Contains {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5	,6));
		System.out.println(c);
		
		Point p =new Point(1,2);
		/*
		 * 集合在判断给定元素是否被集合包含时，是看给定
		 * 元素与集合现有元素是否有equals
		 * 比较为true的元素
		 */
		boolean con = c.contains(p);
		System.out.println(con);
}
}
