package day09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �쳣������ƶ�IO�ĳ��ò���
 * @author nijunran
 *
 */
public class Exception_IO {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br =new BufferedReader(
					new InputStreamReader(
							new FileInputStream(
									"src"+File.separator+
										"day09"	+ File.separator+
											"Exception_IO.java"
										)
							)
					);
			String line = null ;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ִ�����");
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
