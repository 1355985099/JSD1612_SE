package day02;
/**
 * 测试正则表达式：字符集合
 * @author nijunran
 *
 */
public class TestRegEx {
	public static void main(String[] args) {
		String regex1 = "[a-z]";
		String regex2 = "[^a-z]";
		String regex3 = "[a-z&&[^bc]]";
		String regex4 = "\\d";//\d:表示任意一个数字
		String regex5= "\\D";//\D:表示任意一个非数字字符
		String regex6 = "\\s";//\\s:表示任意一个空白字符[\t \n \x0B \f \r]
		String regex7 = "\\S";//\S:表示任意一个非空白字符
		String regex8 = "\\w";//\w:表示任意一个单词字符（只能是数字，字母，下划线）[a-zA-Z_0-9]
		String regex9 = "\\W";//\W:表示任意一个非单词字符[^\w]


		System.out.println("a".matches(regex1));//true
		System.out.println("b".matches(regex2));//false
		System.out.println("f".matches(regex3));//true
		System.out.println("b".matches(regex3));//false
		System.out.println("1".matches(regex4));//true
		System.out.println("1".matches(regex5));//false
		System.out.println(" ".matches(regex6));//true
		System.out.println(" ".matches(regex7));//false
		System.out.println("_".matches(regex8));//true
		System.out.println("_".matches(regex9));//false
		
		
		
		
		
	}
}
