package day01;
/**
 * String常量池
 * 
 */
public class stringDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "helloworld";
		System.out.println(s1 == s2);//true
		s1 = s1 + "!";
		//修改内容就会创建对象
		System.out.println(s1==s2);//false
		/*
		 * 计算式两边都是字面量时自动运算
		 * s4="helloworld"
		 */
		String s4="hello"+"world";
		System.out.println(s2==s4);//true
		/*
		 * 
		 */
		String s="hello";
		String s5=s+"world";
		/*
		 * s2和s5指向的地址不一样
		 */
		System.out.println(s2==s5);//false
		
		System.out.println(s5);
	}
}
