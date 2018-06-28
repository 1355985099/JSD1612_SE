package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * Arrays�ṩ�˾�̬����asList.
 * @author adminitartor
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four"};
		
		System.out.println(Arrays.toString(array));
		
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		/*
		 * �Լ���Ԫ�صĲ������Ƕ�ԭ�����ӦԪ��
		 * �Ĳ���.
		 */
		list.set(2, "3");
		System.out.println("list:"+list);
		System.out.println("array:"+Arrays.toString(array));
		
		/*
		 * �������Ԫ�ػᵼ����������,���Ըò���
		 * ����֧��
		 */
//		list.add("five");
		/*
		 * ���������Ԫ��,��Ҫ���д���һ������
		 */
		List<String> list1 
			= new ArrayList<String>(list);
//		list1.addAll(list);
		System.out.println("list1:"+list1);
		list1.add("five");
		System.out.println("list1:"+list1);
	}
}










