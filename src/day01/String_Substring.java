package day01;

/**
 * String substring(int start, int end) ��ȡ��ǰ�ַ����Ĳ�������
 */
public class String_Substring {
	public static void main(String[] args) {
		// ------------01234567890123
		String str = "www.oracle.com";
		/*
		 * ��ȡ"oracle" java API ��һ���ص㣬ͨ�����������ֱ�ʾ��Χ�Ƕ��ǡ���ͷ����β����
		 */
		String sub = str.substring(4, 10);
		System.out.println(sub);// oracle
		// --------------012345678901
		String host = "www. java.com";
		int start = host.indexOf(".") + 1;
		int end = host.indexOf(".", start);
		sub = host.substring(start, end);
		System.out.println(sub);// java

	}
}
