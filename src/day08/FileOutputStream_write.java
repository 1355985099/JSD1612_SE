package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java��׼IO
 * IO����Ϊ�������������
 * ��������������ȡ���ݵģ������ݶ�ȡ�����ǵĳ�����
 * �����������д�����ݵģ������ݴ����ǵĳ����з��ͳ�ȥ
 * 
 * ����Ϊ�ڵ����봦����
 * �ڵ������ֳ�Ϊ�ͼ������ص��ǣ�����Դ��ȷ����ʵ�����д���ݵ���
 * ���������ֳ�Ϊ�߼������ص��ǣ����ܶ������ڣ�û���壩��
 * 				�������������������и߼�������װ��ĳЩ
 * 				�ص㹦�ܵĶ�д������Ŀ���Ǽ����ǵĶ�д����
 * 
 * java���е��ֽ����������̳���java.io.InputStream
 *       ���е��ֽ���������̳���java.io.OutputStream
 * 
 * �ļ���
 * �ļ������ǵͼ�����������д�ļ�����
 * @author nijunran
 *
 */
public class FileOutputStream_write {
	public static void main(String[] args) throws IOException {
		/*
		 * FileOutputStream��String path��
		 * FileOutputStream��String path,boolean append��׷��ģʽ 
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		String str = "�Ұ������찲��";
		fos.write(str.getBytes("UTF-8"));
		System.out.println("д�����");
		fos.close();
	}
}
