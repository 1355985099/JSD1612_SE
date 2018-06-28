package day06;

import java.io.File;

public class File_Delete2 {
	public static void main(String[] args) {
		File dir = new File("demo");
		if(dir.exists()){
			/*
			 * 删除目录的前提是该目录是个空目录
			 */
			dir.delete();
			System.out.println("删除完毕！");
			
		}
	}
}
