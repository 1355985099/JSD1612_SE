package day02;

/**
 * 包装类提供了一个静态方法:parseXXX(String str) 
 * 该方法可以将字符串解析为对应的基本类型数据.
 * 但是前提是该字符串内容要正确描述
 * 该基本类型可以保存的值.
 */
public class Integer_ParseInt {
	public static void main(String[] args) {
		String str = "123";
		int a = Integer.parseInt(str);
		System.out.println(a + 1);//124

		double d = Double.parseDouble(str);
		System.out.println(d + 1);//124.0

	}
}
