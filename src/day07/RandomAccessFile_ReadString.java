package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ַ���
 * @author nijunran
 *
 */
public class RandomAccessFile_ReadString {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "r");
		byte[] data = new byte[100];
		int len = raf.read(data);
		System.out.println("ʵ�ʶ�ȡ"+len+"���ֽ�");
		
		String str = new String(data,0,len,"utf-8");
		System.out.println(str);
		raf.close();
	}
}
