package day02;

/**
 * String_Split(String regex) ����ǰ�ַ���������
 * ������Ĳ��ֽ��в�֣� ���������в�ֺ�Ĳ���
 * @author nijunran
 *
 */
public class String_Split {
	public static void main(String[] args) {
		String str = "abc123def456ghi789jkl";
		/*
		 * ������Ӣ�Ĳ��ֲ�ֳ���
		 * 
		 * split�����ڲ���ַ���ʱ,����������ƥ����
		 * ���β������ʱ,�м���ֳ�һ�����ַ���.
		 * ����ע��!���ַ���ĩβ������ƥ��,������
		 * ��ֳ����Ŀ��ַ����ᱻ����.
		 */
		String[] data = str.split("[0-9]+");
		System.out.println("len:"+data.length);//4
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
