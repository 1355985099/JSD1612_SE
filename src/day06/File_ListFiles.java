package day06;

import java.io.File;

public class File_ListFiles {
	public static void main(String[] args) {
		/*
		 * 获取当前目录中的所有内容
		 */
		File dir = new File(".");
		File[] subs = dir.listFiles();
		System.out.println("len:"+subs.length);
		for(File sub:subs){
			if(sub.isFile()){
				System.out.print("文件：");
			}else if(sub.isDirectory()){
				System.out.print("目录：");
			}
			System.out.println(sub.getName());
		}
	}
}
