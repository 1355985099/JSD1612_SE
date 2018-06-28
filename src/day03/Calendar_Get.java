package day03;

import java.util.Calendar;

/**
 * Calendar提供一个方法
 * int get(int field)
 * 可以获取给定的时间分量所对应的值
 * 时间分量是一个int值，
 * 无需记住具体取值，使用Calendar提供大量常量即可
 * @author nijunran
 *
 */
public class Calendar_Get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		
		int month = calendar.get(Calendar.MONTH)+1;
		/*
		 * DATE：几号
		 * DAY_OF_MONTH与DATE一致
		 * DAY_OF_YEAR：一年中的第几天
		 * DAY_OF_WEEK：一周中的第几天
		 */
		int day = calendar.get(Calendar.DATE);
		/*
		 * HOUR_OF_DAY：24小时制
		 * HOUR：12小时制
		 */
		int h =calendar.get(Calendar.HOUR_OF_DAY);
		
		int m =calendar.get(Calendar.MINUTE);
		
		int s =calendar.get(Calendar.SECOND);
		
		System.out.println(year+"年"+month+"月"+day+"日"+h+"时"+m+"分"+s+"秒");
		
		int dow = calendar.get(Calendar.DAY_OF_WEEK)-1;
		//   dow = 1;                                2                     -1
		String[] data = {"日","一","二","三","四","五","六"};
		System.out.println("周"+data[dow]);
		
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
	}
}
