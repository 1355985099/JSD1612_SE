package day09;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * java.io.printWriter 具有自动刷新功能的缓冲字符输出流
 * 
 * java.io.BufferedWriter 缓冲字符输出流 PW创建时内部会自动连接BufferedWriter完成缓冲功能
 * 
 * @author nijunran
 *
 */
public class PrintWriter_println {
	public static void main(String[] args) throws IOException {
		/*
		 * PW提供了很多种构造方法，其中直接对文件操作的方法：
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 */
		PrintWriter pw =  new PrintWriter("pw.txt","utf-8");
		pw.println("嘻嘻");
		System.out.println("写出完毕");
		pw.close();
	}
}
