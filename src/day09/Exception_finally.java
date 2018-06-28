package day09;
/**
 * 异常捕获机制中的finally块
 * 
 * finally块可以直接跟在try块或者最后一个catch块之后。
 * finally 块可以保证其中的代码一定执行。
 * 通常会将释放资源等操作放到finally块中
 * 
 * @author nijunran
 *
 */
public class Exception_finally {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "0";
			System.out.println(str.length());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("出错了");
		}finally{
			System.out.println("finally中的代码执行了");
		}
		System.out.println("程序结束了");
	}
}
