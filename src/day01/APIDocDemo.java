package day01;

/**
 * ��ǰ���ǲ����ĵ�ע�͵�ʹ�ù淶 ������ʹ���ĵ�ע��������˵����ǰ�������
 * 
 * @author nijunran
 * @version 1.0
 * @see java.lang.String
 * @since JDK1.0
 */
public class APIDocDemo {
	
	/**
	 * sayHello�����е��ʺ���
	 */
	public static final String INFO = "nihao";
	/**
	 * ����һ�����жԸ����û��ʺ�����ַ���
	 * @param user �������û���
	 * @return �����ʺ�����ַ���
	 */
	public String sayHello(String user) {
		return "nihao!" + user;
	}
}
