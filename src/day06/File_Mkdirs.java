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
			 * mkdirs�������ڴ�����ǰFile��ʾ��Ŀ¼ͬʱ�����в����ڵ�
			 * ��Ŀ¼һͬ��������
			 */
			dir.mkdirs();
			System.out.println("�������");
			
		}else{
			System.out.println("�ļ��Ѵ���");
		}
	}
}
