package day06;

import java.io.File;

public class File_MkDir {
	public static void main(String[] args) {
		File dir = new File("demo");
		if (!dir.exists()) {
			// ������Ŀ¼
			dir.mkdirs();
			System.out.println("������ϣ�");
		} else {
			System.out.println("Ŀ¼�Ѵ���");
		}
	}
}
