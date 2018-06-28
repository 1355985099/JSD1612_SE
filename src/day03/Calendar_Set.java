package day03;

import java.util.Calendar;

/**
 * Calendar提供的方法
 * 对当前Calendar指定分量设定给定的值。
 * 设定后其他时间分量尽量不变，有些会跟着改变，
 * 比如，设置了不同的日期后，星期会有所变化
 * @author nijunran
 *
 */
public class Calendar_Set {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//System.out.println(calendar.getTime());
		/*
		 * 设置时间为2008-08-08 20:08:08
		 */
		calendar.set(Calendar.YEAR, 2018);
		
		calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
		
		/*calendar.set(Calendar.DAY_OF_MONTH, 8);
		
		calendar.set(Calendar.HOUR_OF_DAY, 20);
		
		calendar.set(Calendar.MINUTE, 8);
		
		calendar.set(Calendar.SECOND, 8);
		
		System.out.println(calendar.getTime());*/
		System.out.println(calendar.getActualMaximum(Calendar.DATE));
		
		
		
		
		
	}
	
}
