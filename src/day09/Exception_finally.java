package day09;
/**
 * �쳣��������е�finally��
 * 
 * finally�����ֱ�Ӹ���try��������һ��catch��֮��
 * finally ����Ա�֤���еĴ���һ��ִ�С�
 * ͨ���Ὣ�ͷ���Դ�Ȳ����ŵ�finally����
 * 
 * @author nijunran
 *
 */
public class Exception_finally {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str = "0";
			System.out.println(str.length());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("������");
		}finally{
			System.out.println("finally�еĴ���ִ����");
		}
		System.out.println("���������");
	}
}
