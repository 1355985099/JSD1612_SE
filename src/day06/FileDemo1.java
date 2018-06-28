package day06;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * java.io.File
 * File��������ϵͳ�е�һ���ļ���Ŀ¼
 * ʹ��File����
 * 1���������ʾ���ļ���Ŀ¼�����ԣ����֣���С�ȣ�
 * 2�������ļ���Ŀ¼��������ɾ����
 * 3������Ŀ¼����������
 * ���ǲ��ܣ�
 * �����ļ�����
 * @author nijunran
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
		/*
		 * ·����ʹ�����·��������ƽ̨�޹�
		 * ��.���ǵ�ǰĿ¼����eclipse��Ϊ��ǰ��Ŀ
		 * �ĸ�Ŀ¼
		 */
		File file = new File("."+File.separator+"demo.txt");
		String name = file.getName();
		System.out.println("name="+name);
		/*
		 * �����ļ����ֽ���
		 */
		long length = file.length();
		System.out.println("length="+length);
		//�ɶ���д
		boolean canRead = file.canRead();
		boolean canWrite = file.canWrite();
		System.out.println(canRead);
		System.out.println(canWrite);
		
		long time = file.lastModified();
		
		System.out.println(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��M��d��,H:m:s");
		System.out.println(sdf.format(time));
	}
}
