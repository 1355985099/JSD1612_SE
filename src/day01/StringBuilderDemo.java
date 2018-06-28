

package day01;

/**
 * java.lang.StringBuilderDemo 为了解决字符串频繁修改性能损耗问题，
 * 提供了StringBuilder，该类专门为了修改字符串内容， 提供了修改字符串内容的相关方法
 * 
 * @author nijunran
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "努力学习java";
		/*
		 * 多线程StringBuffer--线程安全的，同步处理，性能稍慢
		 * 单线程StringBuilder--非线程安全，并发处理，性能稍快
		 */
		StringBuffer builder = new StringBuffer(str);
		/*
		 * 努力学习java 努力学习java，为了找个好工作
		 * 
		 * StringBuilder append(String str) 在当前字符串末尾追加给定内容
		 */
		builder.append("，为了找个好工作");
		System.out.println(builder.toString());// 努力学习java，为了找个好工作

		builder.replace(9, 16, "就是为了改变世界");
		System.out.println(builder.toString());// 努力学习java，就是为了改变世界
		/*
		 * StringBuilder delete(int start, int end)
		 */
		builder.delete(0, 8);
		System.out.println(builder.toString());// ，就是为了改变世界

		/*
		 * StringBuilder insert(int index, String s) 将指定字符串插入到指定位置
		 */
		builder.insert(0, "活着");
		System.out.println(builder.toString());// 活着，就是为了改变世界
		
		
	}
}
