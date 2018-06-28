package day08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流复制文件
 * @author nijunran
 *
 */
public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("一张图让你看清Java集合类.png");
		FileOutputStream fos = new FileOutputStream("一张图让你看清Java集合类_cp.png");
		byte[] data = new byte[1024*10];
		int length = -1;
		while((length = fis.read(data))!=-1){
			fos.write(data,0,length);
		}
		System.out.println("复制完毕");
		fis.close();
		fos.close();
		long millis = System.currentTimeMillis();
	}
}
