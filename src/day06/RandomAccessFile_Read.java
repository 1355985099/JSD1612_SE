package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RAF��ȡ�ļ�����
 * @author nijunran
 *
 */
public class RandomAccessFile_Read {
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		int d = raf.read();
		System.out.println(d);
		//����-1����ʾ�ٴζ�ȡʱ�����ļ�ĩβ��.
		d = raf.read();
		System.out.println(d);
		raf.close();
		
	}
}
