package day08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_read {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		/*
		 * int read()
		 * һ�ζ�ȡ1���ַ��������أ�int�ĵ�ʮ��λ��Ч
		 * ������ֵΪ-1���ʾ�ļ�ĩβ
		 */
		int d = -1;
		while((d=isr.read())!=-1){
			System.out.print((char)d);
			
		}
		isr.close();
	}
}
