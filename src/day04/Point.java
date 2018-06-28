package day04;
/**
 * 泛型
 * java1.5之后推出的新特性
 * 泛型又称为参数化类型，可以将当前属性类型，方法
 * 参数类型以及返回值类型的指定交由使用者
 * @author nijunran
 *
 */
public class Point <E>{
	private E x;
	private E y;
	public Point(E x,E y){
		super();
		this.x = x;
		this.y = y;
		
	}
	public E getX() {
		return x;
	}
	public void setX(E x) {
		this.x = x;
	}
	public E getY() {
		return y;
	}
	public void setY(E y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
}
