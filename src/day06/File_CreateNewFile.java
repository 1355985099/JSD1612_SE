package day06;

import java.io.File;
import java.io.IOException;

/**
 * 使用File新建文件
 * @author nijunran
 *
 */
public class File_CreateNewFile {
	public static void main(String[] args) throws IOException {
		/*
		 * 在当前目录下创建文件"test.txt"
		 */
		File file = new File("test.txt");
		if(!file.exists()){
			file.createNewFile();
			System.out.println("创建完毕");
		}else{
			System.out.println("该文件已存在");
		}
	}
	
}
