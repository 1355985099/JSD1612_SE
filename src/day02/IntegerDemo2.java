package day02;
/**
 * JDK 1.5之后推出了一个新的特性
 * 自动拆装箱
 * 该特性是编译器认可,而非JVM认可.
 * 编译器在编译源程序时,会自动补全代码在基本类型与
 * 引用类型之间进行互相转换.
 *
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		/*
		 * 下面的代码会被编译器补充代码为:
		 * int d = new Integer(123).intValue();
		 * 
		 * 将其转换为基本类型,该特性成为:
		 * 自动拆箱
		 */
		int d = new Integer(123);
		/*
		 * 下面的代码会被编译器补充代码为:
		 * Integer i = Integer.valueOf(d);
		 * 将其转换为包装类,该特性为:
		 * 自动装箱
		 */
		Integer i = d;
	}
}






