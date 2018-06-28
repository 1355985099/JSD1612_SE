package day01;
/**
 * String trim()
 * 去除当前字符串两边的空白字符
 */
public class String_Trim {
	public static void main(String[] args) {
		String str = "          hello         ";
		System.out.println(str);//          hello         
		/*
		 * 只去除两边的空白字符，中间的不去除
		 */
		String str1 = str.trim();//hello
		System.out.println(str1);
	}
}
