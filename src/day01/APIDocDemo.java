package day01;

/**
 * 当前类是测试文档注释的使用规范 在类上使用文档注释是用于说明当前类的作用
 * 
 * @author nijunran
 * @version 1.0
 * @see java.lang.String
 * @since JDK1.0
 */
public class APIDocDemo {
	
	/**
	 * sayHello方法中的问候语
	 */
	public static final String INFO = "nihao";
	/**
	 * 返回一个含有对给定用户问候语的字符串
	 * @param user 给定的用户名
	 * @return 含有问候语的字符串
	 */
	public String sayHello(String user) {
		return "nihao!" + user;
	}
}
