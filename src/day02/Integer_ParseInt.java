package day02;

/**
 * ��װ���ṩ��һ����̬����:parseXXX(String str) 
 * �÷������Խ��ַ�������Ϊ��Ӧ�Ļ�����������.
 * ����ǰ���Ǹ��ַ�������Ҫ��ȷ����
 * �û������Ϳ��Ա����ֵ.
 */
public class Integer_ParseInt {
	public static void main(String[] args) {
		String str = "123";
		int a = Integer.parseInt(str);
		System.out.println(a + 1);//124

		double d = Double.parseDouble(str);
		System.out.println(d + 1);//124.0

	}
}
