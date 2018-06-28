package day04;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * ��������ʹ��ͳһ�ķ�ʽ:������ģʽ
 * Iterator iterator()
 * �����ṩ�ĸ÷������Ի�ȡһ���ɹ�������ǰ���ϵ�
 * ������ʵ����.
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
		 * �÷����������жϼ������Ƿ���
		 * Ԫ�ؿ��Ա�������
		 */
		while(it.hasNext()){
			/*
			 * E next()
			 * ��ȡ��һ��Ԫ��
			 */
			String str = (String)it.next();
			System.out.println(str);
			if("#".equals(str)){
				//����������ʱ��Ҫͨ�����Ϸ���ɾԪ��
//				c.remove(str);
				it.remove();
			}
		}
		System.out.println(c);
	}
}
