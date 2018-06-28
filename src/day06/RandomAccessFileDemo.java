package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandoomAccessFile ����������д�ļ����� RAF�ǻ���ָ����ļ����ж�д�ģ�������ָ�뵱ǰλ��
 * ����д�ֽڣ�������Ϻ�ָ����Զ�����ƶ��� ��һ���ֽ�λ�� ����RAF�����ֳ���ģʽ��ֻ������д.
 * 
 * @author nijunran
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 *��ȡ��ǰĿ¼��raf.dat�ļ�
		 *RandomAccessFile���ù��췽��
		 *RandomAccessFile(File file,String m)
		 *RandomAccessFile(File file,String m)
		 *
		 * ��һ������ΪҪ��д���ļ����ڶ�������Ϊ
		 * ��дģʽ�������ַ�����
		 * "r":ֻ��ģʽ
		 * "rw":��дģʽ
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		raf.write(1);
		System.out.println("д����ϣ�");
		raf.close();
		
		
		
	}
	
	
}
