package day01;

/**
 * String substring(int start, int end) 截取当前字符串的部分内容
 */
public class String_Substring {
	public static void main(String[] args) {
		// ------------01234567890123
		String str = "www.oracle.com";
		/*
		 * 截取"oracle" java API 有一个特点，通常用两个数字表示范围是都是”含头不含尾“的
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
