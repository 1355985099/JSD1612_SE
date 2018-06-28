package day09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * �����ַ�������
 * �ص㣺���԰��ж�ȡ�ַ���
 * @author nijunran
 *
 */
public class BufferedReader_readLine {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(
				"."+File.separator+
				"src"+File.separator+
				"day09"+File.separator+
				"BufferedReader_readLine.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		/*
		 * String readLine()
		 * ������ȡ�����ַ���ֱ����ȡ�����з�Ϊֹ��
		 * Ȼ�󽫻��з�֮ǰ��ȡ���������ַ����һ���ַ����󷵻أ�
		 * ���Ƿ��ص��ַ������ǲ��������Ļ��з��ġ�
		 * ������ֵΪnull,���ʾ��ȡ����ĩβ��
		 */
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
}
