package day09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * java.io.printWriter 处理其他流的操作
 * 
 * @author nijunran
 *
 */
public class PrintWriter_println2 {
	public static void main(String[] args) throws IOException {
		/*
		 * PrintWriter(Writer writer) PrintWriter(OutputStream out)
		 * 如果第一个参数是流，那么构造方法还支持第二个参数，是一个boolean值， 若该值为true，则具有自动刷新
		 */
		FileOutputStream fos = new FileOutputStream("pw1.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		PrintWriter pw = new PrintWriter(osw);
		pw.println("12345");
		pw.println("你好啊");
		pw.println("你真笨");
		System.out.println("写出完毕");
		pw.close();
	}
}
