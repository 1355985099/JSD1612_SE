package day08;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����������Ļ���������
 * @author nijunran
 */
public class BufferedOutputStream_flush {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "���д��ɶŶ";
		bos.write(str.getBytes());
		/*
		 * void flush() �÷�����ǿ�ƽ��������ѻ��������һ����д��
		 * 
		 */
		// bos.flush();
		System.out.println("д�����");
		bos.close();
	}

}
