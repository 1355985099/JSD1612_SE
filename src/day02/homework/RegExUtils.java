package day02.homework;

public class RegExUtils {
	public static void main(String[] args) {
		// ��֤���֤�����������ʽ
		final String CARD = "^\\d{15}|\\d{18}$";
		// ��֤���������������ʽ
		final String ZIP_CODE = "^[1-9][0-9]{5}$";
		// �����ֻ������������ʽ
		final String PHONE_NUMBER = "^13[0-9]{9})|(15[89][0-9]{8}$";
		
	}

	public static boolean check(String str, String regex) {
		return str.matches(regex);
	}
}
