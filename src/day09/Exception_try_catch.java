package day09;

/**
 * �쳣��������е�try-catch
 * 
 * @author nijunran
 *
 */
public class Exception_try_catch {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str = "a";
			/*
			 * ��JVM���д���ʱ�����쳣�󣬻�ʵ����һ���������쳣 ��ʵ���� ��������ִ�й��̵���Ϣ���ú� ��Ȼ�����׳���
			 * ����ǰ�����б�try��Χ�����ִ���쳣������ƣ���û�У���Ὣ���쳣�׳�����ǰ�����⣬
			 * ��һ���쳣�׳���main�����⣬�ó��������
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			// try�г���������Ĵ������ִ��
			System.out.println("!!!");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("�����˿�ָ��");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("�ַ����±�Խ����");
			/*
			 * catch����д���������Բ�ͬ�쳣�в�ͬ�����ʩʱ�����Էֱ𲶻���Щ�쳣���������ն�Ӧ������Exception��
			 * ������һ��δ�����쳣�����³����ж�
			 */
		} catch (Exception e) {
			System.out.println("�������Ǹ���");
		}

		System.out.println("���������");
	}
}
