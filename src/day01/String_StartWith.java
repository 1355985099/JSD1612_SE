package day01;

/**
 * boolean startWith(String str) boolean endsWith(String str)
 * �жϵ�ǰ�ַ��Ƿ��Ը����ַ���ʼ�������
 */
public class String_StartWith {
	public static void main(String[] args) {
		String str = "thinking in java";
		boolean start = str.startsWith("thi");
		System.out.println(start);// true

		boolean end = str.endsWith("ava");
		System.out.println(end);// true
	}

}
