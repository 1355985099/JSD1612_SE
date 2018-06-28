

package day01;

/**
 * java.lang.StringBuilderDemo Ϊ�˽���ַ���Ƶ���޸�����������⣬
 * �ṩ��StringBuilder������ר��Ϊ���޸��ַ������ݣ� �ṩ���޸��ַ������ݵ���ط���
 * 
 * @author nijunran
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "Ŭ��ѧϰjava";
		/*
		 * ���߳�StringBuffer--�̰߳�ȫ�ģ�ͬ��������������
		 * ���߳�StringBuilder--���̰߳�ȫ���������������Կ�
		 */
		StringBuffer builder = new StringBuffer(str);
		/*
		 * Ŭ��ѧϰjava Ŭ��ѧϰjava��Ϊ���Ҹ��ù���
		 * 
		 * StringBuilder append(String str) �ڵ�ǰ�ַ���ĩβ׷�Ӹ�������
		 */
		builder.append("��Ϊ���Ҹ��ù���");
		System.out.println(builder.toString());// Ŭ��ѧϰjava��Ϊ���Ҹ��ù���

		builder.replace(9, 16, "����Ϊ�˸ı�����");
		System.out.println(builder.toString());// Ŭ��ѧϰjava������Ϊ�˸ı�����
		/*
		 * StringBuilder delete(int start, int end)
		 */
		builder.delete(0, 8);
		System.out.println(builder.toString());// ������Ϊ�˸ı�����

		/*
		 * StringBuilder insert(int index, String s) ��ָ���ַ������뵽ָ��λ��
		 */
		builder.insert(0, "����");
		System.out.println(builder.toString());// ���ţ�����Ϊ�˸ı�����
		
		
	}
}
