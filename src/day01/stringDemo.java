package day01;
/**
 * String������
 * 
 */
public class stringDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "helloworld";
		System.out.println(s1 == s2);//true
		s1 = s1 + "!";
		//�޸����ݾͻᴴ������
		System.out.println(s1==s2);//false
		/*
		 * ����ʽ���߶���������ʱ�Զ�����
		 * s4="helloworld"
		 */
		String s4="hello"+"world";
		System.out.println(s2==s4);//true
		/*
		 * 
		 */
		String s="hello";
		String s5=s+"world";
		/*
		 * s2��s5ָ��ĵ�ַ��һ��
		 */
		System.out.println(s2==s5);//false
		
		System.out.println(s5);
	}
}
