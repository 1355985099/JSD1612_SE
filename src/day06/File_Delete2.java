package day06;

import java.io.File;

public class File_Delete2 {
	public static void main(String[] args) {
		File dir = new File("demo");
		if(dir.exists()){
			/*
			 * ɾ��Ŀ¼��ǰ���Ǹ�Ŀ¼�Ǹ���Ŀ¼
			 */
			dir.delete();
			System.out.println("ɾ����ϣ�");
			
		}
	}
}
