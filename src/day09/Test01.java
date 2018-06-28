package day09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 简易记事本
 * 
 * 程序启动后输入文件名,然后针对该文件写操作 用户输入的每一行内容都要写入到该文件 当用户输入"exit",程序结束
 * 
 * @author nijunran
 *
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入文件名");
		PrintWriter pw = new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream(scanner.next() + ".txt"
								)
						), true
				);
		String str;
		System.out.println("输入字符");
		do {
			str = scanner.next();
			pw.println(str);// 有行刷新功能

		} while (!str.equals("exit"));
		System.out.println("写出完毕");
		pw.close();
	}
}
