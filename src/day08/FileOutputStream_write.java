package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java标准IO
 * IO流分为输入流和输出流
 * 输入流是用来读取数据的，将数据读取到我们的程序中
 * 输出流是用来写出数据的，将数据从我们的程序中发送出去
 * 
 * 流分为节点流与处理流
 * 节点流：又称为低级流，特点是：数据源明确，真实负责读写数据的流
 * 处理流：又称为高级流，特点是：不能独立存在（没意义），
 * 				用来处理其他流，所有高级流都封装了某些
 * 				特点功能的读写操作，目的是简化我们的读写操作
 * 
 * java所有的字节输入流都继承自java.io.InputStream
 *       所有的字节输出流都继承自java.io.OutputStream
 * 
 * 文件流
 * 文件流就是低级流，用来读写文件的流
 * @author nijunran
 *
 */
public class FileOutputStream_write {
	public static void main(String[] args) throws IOException {
		/*
		 * FileOutputStream（String path）
		 * FileOutputStream（String path,boolean append）追加模式 
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		String str = "我爱北京天安门";
		fos.write(str.getBytes("UTF-8"));
		System.out.println("写出完毕");
		fos.close();
	}
}
