package day04;

/**
 * 新循环,又称为:增强for循环,for each 新循环是java 1.5之后推出的一个新特性. 新循环只用来遍历集合或数组.
 * 新循环是编译器认可,而非虚拟机认可.编译器会将 代码中的新循环遍历数组改变为传统for循环遍历, 将新循环遍历集合改为迭代器遍历集合.
 * 
 * @author adminitartor
 *
 */
public class NewFor_Demo1 {
	public static void main(String[] args) {
		String[] array = new String[] { "one", "two", "three", "four", };
		for(String str:array){
			System.out.println(str);
		}
	}
}
