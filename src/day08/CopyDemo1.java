package day08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ��������ļ�
 * @author nijunran
 *
 */
public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("һ��ͼ���㿴��Java������.png");
		FileOutputStream fos = new FileOutputStream("һ��ͼ���㿴��Java������_cp.png");
		byte[] data = new byte[1024*10];
		int length = -1;
		while((length = fis.read(data))!=-1){
			fos.write(data,0,length);
		}
		System.out.println("�������");
		fis.close();
		fos.close();
		long millis = System.currentTimeMillis();
	}
}
