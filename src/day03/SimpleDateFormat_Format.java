package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 *该类可以根据给定的日期格式
 *在String与Data之间相互转换
 * @author nijunran
 *
 */
public class SimpleDateFormat_Format {
	public static void main(String[] args) {
		Date  date = new Date();
		System.out.println(date);
		/*
		 *2017-01-23   10：31：22
		 *yyyy-MM-dd HH:mm:ss 
		 */
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy年MM月dd日  HH:mm:ss E a"
				);
		/*
		 * String format(Date  date)
		 * 将给定Date表示的时间按照当前
		 * SimpleDateFormat指定的格式转化为字符串
		 */
		String str = sdf.format(date);
		System.out.println(str);
	}
}
