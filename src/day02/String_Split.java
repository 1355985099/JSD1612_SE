package day02;

/**
 * String_Split(String regex) 将当前字符串中满足
 * 正则表达的部分进行拆分， 并返回所有拆分后的部分
 * @author nijunran
 *
 */
public class String_Split {
	public static void main(String[] args) {
		String str = "abc123def456ghi789jkl";
		/*
		 * 将所有英文部分拆分出来
		 * 
		 * split方法在拆分字符串时,若出现连续匹配了
		 * 两次拆分内容时,中间会拆分出一个空字符串.
		 * 但是注意!在字符串末尾若连续匹配,则所有
		 * 拆分出来的空字符串会被忽略.
		 */
		String[] data = str.split("[0-9]+");
		System.out.println("len:"+data.length);//4
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
