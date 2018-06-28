package day02;
/**
 * ����������ʽ���ַ�����
 * @author nijunran
 *
 */
public class TestRegEx {
	public static void main(String[] args) {
		String regex1 = "[a-z]";
		String regex2 = "[^a-z]";
		String regex3 = "[a-z&&[^bc]]";
		String regex4 = "\\d";//\d:��ʾ����һ������
		String regex5= "\\D";//\D:��ʾ����һ���������ַ�
		String regex6 = "\\s";//\\s:��ʾ����һ���հ��ַ�[\t \n \x0B \f \r]
		String regex7 = "\\S";//\S:��ʾ����һ���ǿհ��ַ�
		String regex8 = "\\w";//\w:��ʾ����һ�������ַ���ֻ�������֣���ĸ���»��ߣ�[a-zA-Z_0-9]
		String regex9 = "\\W";//\W:��ʾ����һ���ǵ����ַ�[^\w]


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
