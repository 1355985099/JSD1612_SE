package day01;

/**
 * String 提供了一组静态方法valueOf 作用是可以将基本类型转换为字符串
 * 
 * @author nijunran
 *
 */
public class String_ValueOf {
	public static void main(String[] args) {
		int a = 100;
		String istr = String.valueOf(a);
		System.out.println(istr);// 100

		double d = 123.123;
		String dstr = String.valueOf(d);
		System.out.println(dstr);// 123.123

		istr = a + " ";
		System.out.println(istr);//100
	}
}
