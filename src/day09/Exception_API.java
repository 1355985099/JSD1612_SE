package day09;
/**
 * �쳣���÷���
 * @author nijunran
 *
 */
public class Exception_API {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("���������");
	}
}
