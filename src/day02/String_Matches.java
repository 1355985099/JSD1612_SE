package day02;

/**
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符是否满足格式要求，
 * 满足则返回true
 * @author nijunran
 */
public class String_Matches {
	public static void main(String[] args) {
		String email = "fancq@tedu.cn";
		/*
		 * [a-z]表示a~z之间的任意一个字符
		 * [a-z]+表示一到多个a~z之间的字符
		 */
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		boolean match = email.matches(regex);
		if(match){
			System.out.println("是邮箱");
		}else{
			System.out.println("不是邮箱");
		}
	}
}
