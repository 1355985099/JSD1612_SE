package day06;

import java.io.File;

public class File_Mkdirs {
	public static void main(String[] args) {
		File dir = new File(
				"a"+File.separator+
				"b"+File.separator+
				"c"+File.separator+
				"d"+File.separator+
				"e"+File.separator+
				"f"
				);
		if(!dir.exists()){
			/*
			 * mkdirs方法会在创建当前File表示的目录同时将所有不存在的
			 * 父目录一同创建出来
			 */
			dir.mkdirs();
			System.out.println("创建完毕");
			
		}else{
			System.out.println("文件已存在");
		}
	}
}
