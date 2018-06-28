package day02.homework;

public class RegExUtils {
	public static void main(String[] args) {
		// 验证身份证号码的正则表达式
		final String CARD = "^\\d{15}|\\d{18}$";
		// 验证邮政编码的正则表达式
		final String ZIP_CODE = "^[1-9][0-9]{5}$";
		// 正则手机号码的正则表达式
		final String PHONE_NUMBER = "^13[0-9]{9})|(15[89][0-9]{8}$";
		
	}

	public static boolean check(String str, String regex) {
		return str.matches(regex);
	}
}
