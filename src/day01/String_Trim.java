package day01;
/**
 * String trim()
 * ȥ����ǰ�ַ������ߵĿհ��ַ�
 */
public class String_Trim {
	public static void main(String[] args) {
		String str = "          hello         ";
		System.out.println(str);//          hello         
		/*
		 * ֻȥ�����ߵĿհ��ַ����м�Ĳ�ȥ��
		 */
		String str1 = str.trim();//hello
		System.out.println(str1);
	}
}
