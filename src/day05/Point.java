package day05;

/**
 * ������Ϊ����Ԫ�ز��Լ��϶��Զ���Ԫ�ص�����
 * 
 * @author nijunran
 *
 */
public class Point implements Comparable<Point>{
	private int x;
	private int y;

	public Point() {
		
	}

	public Point(int x, int y) {
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

	public String toString() {
		return "(" + x + "," + y + ")";
	}
	/**
	 * ʵ����Comparable�ӿں�Ҫ����дcompareTo������
	 * �÷����������Ƕ��嵱ǰ�������������֮��Ƚϴ�С�Ĺ���
	 * ����ֵ��עȡֵ��Χ��
	 * ������ֵ>0:��ǰ����this�����ڲ�������o
	 * ����ֵ<0:this<o
	 * ����ֵ=0:this==o
	 * 
	 */
	@Override
	public int compareTo(Point o) {
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x+o.y*o.y;
		return len-olen;
	}

}
