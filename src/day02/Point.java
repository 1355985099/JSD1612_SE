package day02;

/**
 * 使用该类来测试Object中方法的重写原则 该类设计的目的是表示直角坐标系中的一个点
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
	 * 通常使用一个类的toString就应当重写它
	 * toString返回的字符串应当包含当前对象需要外界了解他的属性信息，
	 * 格式没有同一要求按开发时的实际需求而定 
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "(" + x + "," + y +")";//(1,2)
	}
	
	/**
	 * 重写equals方法
	 * Object定义的equals方法的设计目的是比较当前
	 * 对象与给定对象内容是否相同.
	 * 若不重写则是使用"this==o"比较,没有实际意义.
	 * 重写规则按实际开发需求定,原则是比较两个对象
	 * 的属性值是否相同.
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
