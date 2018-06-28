package day06;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
		File dir = new File("a");
		delete(dir);
	}
	/**
	 * 将给定的File表示的文件或目录删除
	 * @param file
	 */
	public static void delete(File file) {
		if(file.isDirectory()){
			//先将其所有子项删掉
			File[] subs = file.listFiles();
			for(File sub:subs){
				delete(sub);
			}
		}
		file.delete();
	}
}
