package day02;

/**
 * boolean matches(String regex)
 * ʹ�ø�����������ʽ��֤��ǰ�ַ��Ƿ������ʽҪ��
 * �����򷵻�true
 * @author nijunran
 */
public class String_Matches {
	public static void main(String[] args) {
		String email = "fancq@tedu.cn";
		/*
		 * [a-z]��ʾa~z֮�������һ���ַ�
		 * [a-z]+��ʾһ�����a~z֮����ַ�
		 */
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		boolean match = email.matches(regex);
		if(match){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
	}
}
