package day07;
/**
 * д�ַ���
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_WriteString {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
		String str = "��������ݳ��������Ӷ�����";
		/*
		 *String�ṩ��ת��Ϊ�ֽڵķ�����
		 *byte[] getBytes()
		 *����ǰ�ַ�������ϵͳĬ�ϵ��ַ���ת��Ϊһ���ֽ� 
		 *byte[] getBytes(String csn)
		 *����ָ���ַ�������ǰ�ַ���ת��Ϊһ���ֽ� 
		 *�����ַ�������
		 */
		byte[] data = str.getBytes("utf-8");
		raf.write(data);
		System.out.println("д�����");
		
		raf.close();
	}
	
}
