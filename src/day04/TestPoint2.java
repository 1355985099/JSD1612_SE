package day04;
/**
 * ���͵�ʵ��������Object
 * �����Ǳ������Ͽ�
 * @author nijunran
 *
 */
public class TestPoint2 {
	public static void main(String[] args) {
		/*
		 * �����Ǳ������Ͽɣ�����������������͵�ʵ������
		 * ����Object.���ԣ�������ڴ���p1��ʵ����ʱ���ڲ�
		 * ��x,y�����;���Object.
		 * ֻ�Ǳ������ڱ�������ǻ�����Ӧ�Ĳ�����������
		 * �����͸�ֵʱ������������ʵ�ʵ�ֵ�Ƿ���Ϸ���
		 * ָ������.�����ϱ��벻ͨ��.
		 * 
		 */
		Point<Integer>p1 = new Point<Integer>(1,2);
		/*
		 * �ڻ�ȡ����ֵ��ʱ�򣬱������Ჹ�����ʹ���.
		 * ����Ĵ���ᱻ��Ϊ��
		 * int x1 = ((Integer)p1.getX()).intValue();
		 * 
		 */
		int x1 = p1.getX();
		System.out.println("x1:"+x1);
		//�������������ƥ��
		p1.setX(2);
		System.out.println("p1:"+p1);
		/*
		 * ��ָ�����ͣ���ô���͵����;���ԭ��Object
		 */
		Point p2 = p1;
		p2.setX("һ");
		String x2 = (String)p2.getX();
		System.out.println("x2:"+x2);
		System.out.println("p2:"+p2);
		/*
		 * ��������������Ĵ�����:
		 * x1 = ((Integer)p1.getX()).intValue();
		 * ���Խ�String����ΪInteger���׳��쳣.
		 */
		x1 = p1.getX();//ClassCastException
		System.out.println("x1:"+x1);
	}
}
