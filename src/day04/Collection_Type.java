package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �����ڼ�����ʹ����㷺
 * ��������Լ�������е�Ԫ������
 * @author nijunran
 *
 */
public class Collection_Type {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		/*
		 * �������ķ�����������ļ��Ϸ�������һ��
		 */
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
		
		for(String str : c){
			System.out.println(str);
		}
	}
}
