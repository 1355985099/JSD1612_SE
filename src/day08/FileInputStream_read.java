package day08;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * java.io.FileInputStream 文件输入流
 */
public class FileInputStream_read {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		byte[] data = new byte[100];
		int len = fis.read(data);
		String str = new String(data, 0, len, "utf-8");
		System.out.println(str);
		fis.close();
	}
}
