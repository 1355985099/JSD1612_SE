package day06;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File�½��ļ�
 * @author nijunran
 *
 */
public class File_CreateNewFile {
	public static void main(String[] args) throws IOException {
		/*
		 * �ڵ�ǰĿ¼�´����ļ�"test.txt"
		 */
		File file = new File("test.txt");
		if(!file.exists()){
			file.createNewFile();
			System.out.println("�������");
		}else{
			System.out.println("���ļ��Ѵ���");
		}
	}
	
}
