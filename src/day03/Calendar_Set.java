package day03;

import java.util.Calendar;

/**
 * Calendar�ṩ�ķ���
 * �Ե�ǰCalendarָ�������趨������ֵ��
 * �趨������ʱ������������䣬��Щ����Ÿı䣬
 * ���磬�����˲�ͬ�����ں����ڻ������仯
 * @author nijunran
 *
 */
public class Calendar_Set {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//System.out.println(calendar.getTime());
		/*
		 * ����ʱ��Ϊ2008-08-08 20:08:08
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
