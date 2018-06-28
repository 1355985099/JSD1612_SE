package day09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流
 * 特点：可以按行读取字符串
 * @author nijunran
 *
 */
public class BufferedReader_readLine {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(
				"."+File.separator+
				"src"+File.separator+
				"day09"+File.separator+
				"BufferedReader_readLine.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		/*
		 * String readLine()
		 * 连续读取若干字符，直到读取到换行符为止，
		 * 然后将换行符之前读取到的所有字符组成一个字符串后返回，
		 * 但是返回的字符串中是不含有最后的换行符的。
		 * 若返回值为null,则表示读取到了末尾。
		 */
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
}
