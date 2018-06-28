package day08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲流加快读写效率
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * 缓冲流是高级流
 * @author nijunran
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("一张图让你看清Java集合类.png");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("一张图让你看清Java集合类_cp2.png");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int d = -1;
		while ((d = bis.read()) != -1) {
			bos.write(d);
		}
		System.out.println("复制完毕!");

		bis.close();
		bos.close();
		long millis = System.currentTimeMillis();
	}
}
