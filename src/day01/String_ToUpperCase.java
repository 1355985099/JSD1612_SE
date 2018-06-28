package day01;

/**
 * String toUpperCase() String toLowerCase() 将当前字符串的英文部分转换为全大写或全小写
 * 
 * @author nijunran
 *
 */
public class String_ToUpperCase {
	public static void main(String[] args) {
		String str = "我爱java";
		String upper = str.toUpperCase();
		System.out.println(upper);// 我爱JAVA

		String lower = str.toLowerCase();
		System.out.println(lower);// 我爱java
	}

}
