package day09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * java.io.printWriter �����������Ĳ���
 * 
 * @author nijunran
 *
 */
public class PrintWriter_println2 {
	public static void main(String[] args) throws IOException {
		/*
		 * PrintWriter(Writer writer) PrintWriter(OutputStream out)
		 * �����һ��������������ô���췽����֧�ֵڶ�����������һ��booleanֵ�� ����ֵΪtrue��������Զ�ˢ��
		 */
		FileOutputStream fos = new FileOutputStream("pw1.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		PrintWriter pw = new PrintWriter(osw);
		pw.println("12345");
		pw.println("��ð�");
		pw.println("���汿");
		System.out.println("д�����");
		pw.close();
	}
}
