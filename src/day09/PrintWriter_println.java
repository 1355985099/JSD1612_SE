package day09;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * java.io.printWriter �����Զ�ˢ�¹��ܵĻ����ַ������
 * 
 * java.io.BufferedWriter �����ַ������ PW����ʱ�ڲ����Զ�����BufferedWriter��ɻ��幦��
 * 
 * @author nijunran
 *
 */
public class PrintWriter_println {
	public static void main(String[] args) throws IOException {
		/*
		 * PW�ṩ�˺ܶ��ֹ��췽��������ֱ�Ӷ��ļ������ķ�����
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 */
		PrintWriter pw =  new PrintWriter("pw.txt","utf-8");
		pw.println("����");
		System.out.println("д�����");
		pw.close();
	}
}
