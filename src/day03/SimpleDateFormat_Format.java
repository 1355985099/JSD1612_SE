package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 *������Ը��ݸ��������ڸ�ʽ
 *��String��Data֮���໥ת��
 * @author nijunran
 *
 */
public class SimpleDateFormat_Format {
	public static void main(String[] args) {
		Date  date = new Date();
		System.out.println(date);
		/*
		 *2017-01-23   10��31��22
		 *yyyy-MM-dd HH:mm:ss 
		 */
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy��MM��dd��  HH:mm:ss E a"
				);
		/*
		 * String format(Date  date)
		 * ������Date��ʾ��ʱ�䰴�յ�ǰ
		 * SimpleDateFormatָ���ĸ�ʽת��Ϊ�ַ���
		 */
		String str = sdf.format(date);
		System.out.println(str);
	}
}
