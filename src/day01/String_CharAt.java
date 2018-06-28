package day01;

/**
 * char charAt(int index) 返回当前字符串指定位置的字符
 * 
 * @author nijunran
 *
 */
public class String_CharAt {
	public static void main(String[] args) {
		String str = "hello";
		char c = str.charAt(2);
		System.out.println(c);// l

		String info = "上海自来水来自海上";
		for (int i = 0; i < info.length() / 2; i++) {
			if (info.charAt(i) != info.charAt(info.length() - 1 - i)) {
				System.out.println("不是回文");
				return;
				// System.out.print("不");
			}
		}
		System.out.println("是回文");

	}
}
