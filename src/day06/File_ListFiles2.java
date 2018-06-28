package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * File提供了一个重载的List Files方法，
 * 该方法允许传入一个文件过滤器FileList,然后将
 * 当前目录中满足过滤器要求的所有子项返回
 */
public class File_ListFiles2 {
	public static void main(String[] args) {
		File dir = new File(".");
		FileFilter filter = new FileFilter(){
			@Override
			public boolean accept(File file) {
				String name = file.getName();
				System.out.println("正在过滤："+name);
				return name.startsWith(".");
			}
		};
		File[] subs = dir.listFiles(filter);
		System.out.println("len:"+subs.length);
		for(File sub:subs){
			System.out.println(sub.getName());
		}
	}
}
