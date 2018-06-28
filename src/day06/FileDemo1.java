package day06;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * java.io.File
 * File用来描述系统中的一个文件或目录
 * 使用File可以
 * 1：访问其表示的文件或目录的属性（名字，大小等）
 * 2：操作文件或目录（创建，删除）
 * 3：访问目录的所有子项
 * 但是不能：
 * 访问文件数据
 * @author nijunran
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
		/*
		 * 路径都使用相对路径，做到平台无关
		 * “.”是当前目录，在eclipse中为当前项目
		 * 的根目录
		 */
		File file = new File("."+File.separator+"demo.txt");
		String name = file.getName();
		System.out.println("name="+name);
		/*
		 * 返回文件的字节量
		 */
		long length = file.length();
		System.out.println("length="+length);
		//可读可写
		boolean canRead = file.canRead();
		boolean canWrite = file.canWrite();
		System.out.println(canRead);
		System.out.println(canWrite);
		
		long time = file.lastModified();
		
		System.out.println(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日,H:m:s");
		System.out.println(sdf.format(time));
	}
}
