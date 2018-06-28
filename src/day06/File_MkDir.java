package day06;

import java.io.File;

public class File_MkDir {
	public static void main(String[] args) {
		File dir = new File("demo");
		if (!dir.exists()) {
			// 创建该目录
			dir.mkdirs();
			System.out.println("创建完毕！");
		} else {
			System.out.println("目录已存在");
		}
	}
}
