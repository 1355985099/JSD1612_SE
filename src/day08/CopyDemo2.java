package day08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ�û������ӿ��дЧ��
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * �������Ǹ߼���
 * @author nijunran
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("һ��ͼ���㿴��Java������.png");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("һ��ͼ���㿴��Java������_cp2.png");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int d = -1;
		while ((d = bis.read()) != -1) {
			bos.write(d);
		}
		System.out.println("�������!");

		bis.close();
		bos.close();
		long millis = System.currentTimeMillis();
	}
}
