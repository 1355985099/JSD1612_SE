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
		 * 一次读取1个字符，并返回，int的低十六位有效
		 * 若返回值为-1则表示文件末尾
		 */
		int d = -1;
		while((d=isr.read())!=-1){
			System.out.print((char)d);
			
		}
		isr.close();
	}
}
