package day01;
/**
 * int indexOf(String str)
 * 返回给定字符串在当前字符串中的位置，
 * 若当前字符串不含有给点内容则返回-1
 */
public class String_IndexOf {
	public static void main(String[] args) {
		//                 
		String str = "thinking in java";
		int index=str.indexOf("in");
		System.out.println(index);//2
		//从指定位置开始查找给定字符串的位置
		index =str.indexOf("in", 3);
		System.out.println(index);//5
		//查找最后一次出现给定字符串的位置
		index=str.lastIndexOf("in");
		System.out.println(index);//9
	}
}
