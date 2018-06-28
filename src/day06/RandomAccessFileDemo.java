package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandoomAccessFile 该类用来读写文件数据 RAF是基于指针对文件进行读写的，总是在指针当前位置
 * 读或写字节，并且完毕后指针会自动向后移动到 下一个字节位置 创建RAF有两种常用模式：只读，读写.
 * 
 * @author nijunran
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 *读取当前目录下raf.dat文件
		 *RandomAccessFile常用构造方法
		 *RandomAccessFile(File file,String m)
		 *RandomAccessFile(File file,String m)
		 *
		 * 第一个参数为要读写的文件，第二个参数为
		 * 读写模式，常用字符串：
		 * "r":只读模式
		 * "rw":读写模式
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		raf.write(1);
		System.out.println("写出完毕！");
		raf.close();
		
		
		
	}
	
	
}
