package day06;

import java.io.File;

public class File_Delete {
	public static void main(String[] args) {
		File file = new File("test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("ɾ�����");
		}else{
			System.out.println("�ļ�������");
		}
	}
}
