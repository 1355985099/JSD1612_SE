package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Reader,Write �ַ��� �ַ����Ķ�д��λ�����ַ�Ϊ��λ��
 * 
 * ת������ OutputStreamWriter InputStreamReader ��νת��������Ϊ�����ַ�����ֻ�ܴ����ַ�������
 * �ͼ���ͨ�������ֽ��������²����ֽ����ӣ����� ת�����ṩ�Ĺ��췽���������ǽ��������ֽ����� ��ת�������������ַ���
 * ������ͨ���ڽ������ַ������ֽ�������ʱҪʹ��ת�������й���
 * 
 * @author nijunran
 *
 */
public class OutputStreamWriter_write {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		osw.write("�����ڳɶ��Ľ�ͷ��һ��");
		System.out.println("д�����");
		osw.close();
	}
}
