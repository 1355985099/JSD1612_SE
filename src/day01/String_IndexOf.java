package day01;
/**
 * int indexOf(String str)
 * ���ظ����ַ����ڵ�ǰ�ַ����е�λ�ã�
 * ����ǰ�ַ��������и��������򷵻�-1
 */
public class String_IndexOf {
	public static void main(String[] args) {
		//                 
		String str = "thinking in java";
		int index=str.indexOf("in");
		System.out.println(index);//2
		//��ָ��λ�ÿ�ʼ���Ҹ����ַ�����λ��
		index =str.indexOf("in", 3);
		System.out.println(index);//5
		//�������һ�γ��ָ����ַ�����λ��
		index=str.lastIndexOf("in");
		System.out.println(index);//9
	}
}
