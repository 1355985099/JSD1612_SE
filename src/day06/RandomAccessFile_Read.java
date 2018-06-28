package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读取文件数据
 * @author nijunran
 *
 */
public class RandomAccessFile_Read {
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		int d = raf.read();
		System.out.println(d);
		//返回-1，表示再次读取时读到文件末尾了.
		d = raf.read();
		System.out.println(d);
		raf.close();
		
	}
}
