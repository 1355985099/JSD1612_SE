package day02;
/**
 * JDK 1.5֮���Ƴ���һ���µ�����
 * �Զ���װ��
 * �������Ǳ������Ͽ�,����JVM�Ͽ�.
 * �������ڱ���Դ����ʱ,���Զ���ȫ�����ڻ���������
 * ��������֮����л���ת��.
 *
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		/*
		 * ����Ĵ���ᱻ�������������Ϊ:
		 * int d = new Integer(123).intValue();
		 * 
		 * ����ת��Ϊ��������,�����Գ�Ϊ:
		 * �Զ�����
		 */
		int d = new Integer(123);
		/*
		 * ����Ĵ���ᱻ�������������Ϊ:
		 * Integer i = Integer.valueOf(d);
		 * ����ת��Ϊ��װ��,������Ϊ:
		 * �Զ�װ��
		 */
		Integer i = d;
	}
}






