package day02;

/**
 * 数字类型包装类提供了两个常量: 
 * MAX_VALUE,MIN_VALUE 分别表示该包装类
 * 对应的基本类型的取值范围
 * @author adminitartor
 *
 */
public class Integer_MAX_VALUE {
	public static void main(String[] args) {
		// 01111111 11111111 11111111 11111111
		int imax = Integer.MAX_VALUE;
		System.out.println(imax);//

		int imin = Integer.MIN_VALUE;
		System.out.println(imin);//

		long lmax = Long.MAX_VALUE;
		System.out.println(lmax);

		long lmin = Long.MIN_VALUE;
		System.out.println(lmin);
	}
}
