package day01;

/**
 * char charAt(int index) ���ص�ǰ�ַ���ָ��λ�õ��ַ�
 * 
 * @author nijunran
 *
 */
public class String_CharAt {
	public static void main(String[] args) {
		String str = "hello";
		char c = str.charAt(2);
		System.out.println(c);// l

		String info = "�Ϻ�����ˮ���Ժ���";
		for (int i = 0; i < info.length() / 2; i++) {
			if (info.charAt(i) != info.charAt(info.length() - 1 - i)) {
				System.out.println("���ǻ���");
				return;
				// System.out.print("��");
			}
		}
		System.out.println("�ǻ���");

	}
}
