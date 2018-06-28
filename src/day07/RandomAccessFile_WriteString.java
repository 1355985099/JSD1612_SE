package day07;
/**
 * 写字符串
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_WriteString {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
		String str = "该配合你演出的我演视而不见";
		/*
		 *String提供了转换为字节的方法：
		 *byte[] getBytes()
		 *将当前字符串按照系统默认的字符集转换为一组字节 
		 *byte[] getBytes(String csn)
		 *按照指定字符集将当前字符串转换为一组字节 
		 *常用字符集名称
		 */
		byte[] data = str.getBytes("utf-8");
		raf.write(data);
		System.out.println("写出完毕");
		
		raf.close();
	}
	
}
