package day04;

import java.util.Collection;
import java.util.HashSet;

/**
 * ����ת��Ϊ����
 * Collection�ṩ�˷���toArray���Խ���ǰ
 * ����ת��Ϊһ������
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
		//�÷���������
//		Object[] array = c.toArray();
		
		String[] array 
			= c.toArray(new String[c.size()]);
		System.out.println("len:"+array.length);
		for(String str : array){
			System.out.println(str);
		}
		
	}
}




