package day02;

/**
 * ����Point��д��Object��ط���
 * 
 * @author nijunran
 *
 */
public class TestPoint {
	public static void main(String[] args) {
		Point p = new Point();
		p.setX(1);
		p.setY(2);
		/*
		 * Object��toString�������ص��Ƕ���������������ĵ�ַ��Ϣ
		 * ��ʽ������@��ַ
		 * �����ַ�����ʵ�ʿ���ûʲô����
		 * ͨ������ʹ��һ�������toString��Ӧ����д�÷���
		 */
		String str = p.toString();
		System.out.println(str);
	}
}
