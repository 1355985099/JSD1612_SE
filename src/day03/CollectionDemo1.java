package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * ���ϣ�������һ������������һ��Ԫ�ء������ṩ�˱��ڲ���Ԫ�ص���ط���
 * �����������ӿڣ�
 * java.util.List:���ظ�������������
 * java.util.Set:�����ظ�����
 * Ԫ���Ƿ��ظ�����������equals�����ıȽϽ��
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
		 * ���ص�ǰ�����е�����
		 */
		int size = c.size();
		System.out.println(size);
		/*
		 * boolean isEmpty
		 * �жϼ����Ƿ�Ϊ��
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
