package day09;

/**
 * 异常处理机制中的try-catch
 * 
 * @author nijunran
 *
 */
public class Exception_try_catch {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "a";
			/*
			 * 当JVM运行代码时发现异常后，会实例化一个该类型异常 的实例， 并将代码执行过程等信息设置好 ，然后将其抛出，
			 * 若当前代码有被try包围，则会执行异常处理机制，若没有，则会将该异常抛出到当前方法外，
			 * 当一个异常抛出到main方法外，该程序结束。
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			// try中出错代码后面的代码均不执行
			System.out.println("!!!");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("出现了空指针");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("字符串下标越界了");
			/*
			 * catch可以写多个，当针对不同异常有不同解决措施时，可以分别捕获那些异常，但是最终都应当捕获Exception，
			 * 避免因一个未捕获异常而导致程序中断
			 */
		} catch (Exception e) {
			System.out.println("反正就是个错");
		}

		System.out.println("程序结束了");
	}
}
