package day06;

import java.io.File;

public class File_ListFiles {
	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰĿ¼�е���������
		 */
		File dir = new File(".");
		File[] subs = dir.listFiles();
		System.out.println("len:"+subs.length);
		for(File sub:subs){
			if(sub.isFile()){
				System.out.print("�ļ���");
			}else if(sub.isDirectory()){
				System.out.print("Ŀ¼��");
			}
			System.out.println(sub.getName());
		}
	}
}
