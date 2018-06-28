package day04;
/**
 * 泛型的实际类型是Object
 * 泛型是编译器认可
 * @author nijunran
 *
 */
public class TestPoint2 {
	public static void main(String[] args) {
		/*
		 * 泛型是编译器认可，而不是虚拟机，泛型的实际类型
		 * 就是Object.所以，虚拟机在创建p1的实例的时候内部
		 * 的x,y的类型就是Object.
		 * 只是编译器在编译程序是会做相应的操作，当我们
		 * 给泛型赋值时，编译器会检查实际的值是否符合泛型
		 * 指定类型.不符合编译不通过.
		 * 
		 */
		Point<Integer>p1 = new Point<Integer>(1,2);
		/*
		 * 在获取泛型值的时候，编译器会补充造型代码.
		 * 下面的代码会被改为：
		 * int x1 = ((Integer)p1.getX()).intValue();
		 * 
		 */
		int x1 = p1.getX();
		System.out.println("x1:"+x1);
		//编译器检查类型匹配
		p1.setX(2);
		System.out.println("p1:"+p1);
		/*
		 * 不指定泛型，那么泛型的类型就是原型Object
		 */
		Point p2 = p1;
		p2.setX("一");
		String x2 = (String)p2.getX();
		System.out.println("x2:"+x2);
		System.out.println("p2:"+p2);
		/*
		 * 由于虚拟机看到的代码是:
		 * x1 = ((Integer)p1.getX()).intValue();
		 * 所以将String造型为Integer会抛出异常.
		 */
		x1 = p1.getX();//ClassCastException
		System.out.println("x1:"+x1);
	}
}
