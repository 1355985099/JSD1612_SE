package day04;

/**
 * ��ѭ��,�ֳ�Ϊ:��ǿforѭ��,for each ��ѭ����java 1.5֮���Ƴ���һ��������. ��ѭ��ֻ�����������ϻ�����.
 * ��ѭ���Ǳ������Ͽ�,����������Ͽ�.�������Ὣ �����е���ѭ����������ı�Ϊ��ͳforѭ������, ����ѭ���������ϸ�Ϊ��������������.
 * 
 * @author adminitartor
 *
 */
public class NewFor_Demo1 {
	public static void main(String[] args) {
		String[] array = new String[] { "one", "two", "three", "four", };
		for(String str:array){
			System.out.println(str);
		}
	}
}
