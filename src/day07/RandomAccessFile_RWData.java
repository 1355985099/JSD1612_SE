package day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本数据类型 以及 RAF基于指针读写的操作
 * 
 * @author nijunran
 *
 */
public class RandomAccessFile_RWData {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		/*
		 *获取指针的位置
		 */
		long pos = raf.getFilePointer();
		System.out.println("pos:" + pos);
		
		int max = Integer.MAX_VALUE;
		/*
		 * void write(max); 一次只写一个字节
		 */
		raf.write(max >>> 24);
		System.out.println("pos:" + raf.getFilePointer());
		raf.write(max >>> 16);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(max >>> 8);
		System.out.println("pos:" + raf.getFilePointer());
		raf.write(max);
		System.out.println("pos:"+raf.getFilePointer());
		

		/*
		 * void writInt(max); 一次写四个字节
		 */
		raf.writeInt(max);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeLong(123L);
		System.out.println("pos:" + raf.getFilePointer());
		
		raf.writeDouble(123.123);
		System.out.println("pos:" + raf.getFilePointer());
		/*
		 * void seek(long pos) 将指针移动到指定位置
		 */
		raf.seek(0);
		System.out.println("pos:" + raf.getFilePointer());
		/*
		 * EOF:end of file
		 */
		int d = raf.readInt();
		System.out.println(d);
		//读取long值
		raf.seek(8);
		long l = raf.readLong();
		System.out.println(l);
		//读取double值
		double dd = raf.readDouble();
		System.out.println(dd);//123.123
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.seek(0);
		l = raf.readLong();
		System.out.println(l);
				
		raf.close();

	}

}
