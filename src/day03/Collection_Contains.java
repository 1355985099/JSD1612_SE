package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e)
 * �жϵ�ǰ�����Ƿ��������Ԫ��
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
		 * �������жϸ���Ԫ���Ƿ񱻼��ϰ���ʱ���ǿ�����
		 * Ԫ���뼯������Ԫ���Ƿ���equals
		 * �Ƚ�Ϊtrue��Ԫ��
		 */
		boolean con = c.contains(p);
		System.out.println(con);
}
}
