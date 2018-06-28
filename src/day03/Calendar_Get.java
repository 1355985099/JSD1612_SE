package day03;

import java.util.Calendar;

/**
 * Calendar�ṩһ������
 * int get(int field)
 * ���Ի�ȡ������ʱ���������Ӧ��ֵ
 * ʱ�������һ��intֵ��
 * �����ס����ȡֵ��ʹ��Calendar�ṩ������������
 * @author nijunran
 *
 */
public class Calendar_Get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		
		int month = calendar.get(Calendar.MONTH)+1;
		/*
		 * DATE������
		 * DAY_OF_MONTH��DATEһ��
		 * DAY_OF_YEAR��һ���еĵڼ���
		 * DAY_OF_WEEK��һ���еĵڼ���
		 */
		int day = calendar.get(Calendar.DATE);
		/*
		 * HOUR_OF_DAY��24Сʱ��
		 * HOUR��12Сʱ��
		 */
		int h =calendar.get(Calendar.HOUR_OF_DAY);
		
		int m =calendar.get(Calendar.MINUTE);
		
		int s =calendar.get(Calendar.SECOND);
		
		System.out.println(year+"��"+month+"��"+day+"��"+h+"ʱ"+m+"��"+s+"��");
		
		int dow = calendar.get(Calendar.DAY_OF_WEEK)-1;
		//   dow = 1;                                2                     -1
		String[] data = {"��","һ","��","��","��","��","��"};
		System.out.println("��"+data[dow]);
		
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
	}
}
