package day02;

/**
 * String֧��������ʽ������
 * String replaceAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ����
 * �ַ���
 */
public class String_ReplaceAll {
	public static void main(String[] args) {
		String str = "abc123def456ghi789jkl";
		/*
		 * �����ֲ����滻Ϊ"#NUMBER#"
		 */
		str = str.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(str);
	}
}
