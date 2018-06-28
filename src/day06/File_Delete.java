package day06;

import java.io.File;

public class File_Delete {
	public static void main(String[] args) {
		File file = new File("test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("删除完毕");
		}else{
			System.out.println("文件不存在");
		}
	}
}
