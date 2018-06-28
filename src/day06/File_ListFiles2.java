package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * File�ṩ��һ�����ص�List Files������
 * �÷���������һ���ļ�������FileList,Ȼ��
 * ��ǰĿ¼�����������Ҫ������������
 */
public class File_ListFiles2 {
	public static void main(String[] args) {
		File dir = new File(".");
		FileFilter filter = new FileFilter(){
			@Override
			public boolean accept(File file) {
				String name = file.getName();
				System.out.println("���ڹ��ˣ�"+name);
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
