package day06;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
		File dir = new File("a");
		delete(dir);
	}
	/**
	 * ��������File��ʾ���ļ���Ŀ¼ɾ��
	 * @param file
	 */
	public static void delete(File file) {
		if(file.isDirectory()){
			//�Ƚ�����������ɾ��
			File[] subs = file.listFiles();
			for(File sub:subs){
				delete(sub);
			}
		}
		file.delete();
	}
}
