package day02;

/**
 * ʹ�ø���������Object�з�������дԭ�� ������Ƶ�Ŀ���Ǳ�ʾֱ������ϵ�е�һ����
 * 
 * @author nijunran
 *
 */
public class Point {
	private int x;
	private int y;

	public Point(){
		
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/*
	 * ͨ��ʹ��һ�����toString��Ӧ����д��
	 * toString���ص��ַ���Ӧ��������ǰ������Ҫ����˽�����������Ϣ��
	 * ��ʽû��ͬһҪ�󰴿���ʱ��ʵ��������� 
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "(" + x + "," + y +")";//(1,2)
	}
	
	/**
	 * ��дequals����
	 * Object�����equals���������Ŀ���ǱȽϵ�ǰ
	 * ������������������Ƿ���ͬ.
	 * ������д����ʹ��"this==o"�Ƚ�,û��ʵ������.
	 * ��д����ʵ�ʿ�������,ԭ���ǱȽ���������
	 * ������ֵ�Ƿ���ͬ.
	 */
	public boolean equals(Object o){
		if(o==null){
			return false;
		}
		if(o==this){
			return true;
		}
		if(o instanceof Point){
			Point p = (Point)o;
			return this.x==p.x&&this.y==p.y;
		}		
		return false;
	}

}
