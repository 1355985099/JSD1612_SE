package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar 日历类 是一个抽象类，
 * 规定了操作日期的相关方法 常用的实现类：
 * 格里高里历GergorianCalendar 即：阳历
 * 实例化可以使用Calendar提供的静态方法getInstance()
 * 方法返回一个当前系统的所在地区适用的实现类，
 * 大部分地区返回的都是阳历
 * 
 * @author nijunran
 *
 */
public class Calendar_GetInstance {
	public static void main(String[] args) {
		/*
		 * 默认创建出来的Calendar实现类
		 * 实例是表示当前系统时间
		 */
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/*
		 * Calendar->Date
		 * Date getTime()
		 * calendar提供了方法getTime,该方法可以将
		 * 当前Calendar表示的日期以一个Date类型实例返回
		 * 
		 */
		
		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * Date->Calendar
		 * void setTime(Date date)
		 * Calendar提供的方法setTime允许传入一个Date对象
		 * 使得当前Calendar表示给定的Date所表示的日期
		 */
		calendar.setTime(date);
		
		
	}
}
