package day09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ���׼��±�
 * 
 * ���������������ļ���,Ȼ����Ը��ļ�д���� �û������ÿһ�����ݶ�Ҫд�뵽���ļ� ���û�����"exit",�������
 * 
 * @author nijunran
 *
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����ļ���");
		PrintWriter pw = new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream(scanner.next() + ".txt"
								)
						), true
				);
		String str;
		System.out.println("�����ַ�");
		do {
			str = scanner.next();
			pw.println(str);// ����ˢ�¹���

		} while (!str.equals("exit"));
		System.out.println("д�����");
		pw.close();
	}
}
