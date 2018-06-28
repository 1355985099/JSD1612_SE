package day02;

/**
 * 测试Point重写的Object相关方法
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
		 * Object的toString方法返回的是对象句柄；即：对象的地址信息
		 * 格式：类名@地址
		 * 但该字符串对实际开发没什么意义
		 * 通常我们使用一个对象的toString就应当重写该方法
		 */
		String str = p.toString();
		System.out.println(str);
	}
}
