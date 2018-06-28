package day09;
/**
 * 异常常用方法
 * @author nijunran
 *
 */
public class Exception_API {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("程序结束了");
	}
}
