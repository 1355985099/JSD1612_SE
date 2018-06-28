package day01;

/**
 * boolean startWith(String str) boolean endsWith(String str)
 * 判断当前字符是否以给定字符开始或结束的
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
