package day03;

import java.util.Date;

/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ��ʱ��
 * �ڲ�ά��һ��longֵ����ֵΪUTCʱ��.��ʾ����
 * ��1970��Ԫ����һ�̵���ǰDate��ʾ��ʱ����
 * �����ĺ���
 * ����Date�����ȱ�ݣ�ǧ��棬ʱ���������Դ󲿷ַ���
 * ������Ϊ��ʱ�ķ��������ڽ���ʹ����
 * 
 * @author nijunran
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		/*
		 * Ĭ�ϴ����ͱ�ʾ��ǰϵͳʱ��
		 */
		Date date = new Date();
		/*
		 * Date��д��toString����
		 */
		date.getYear();//���ڽ���ʹ����
		System.out.println(date);
		
		long time = date.getTime();
		System.out.println(time);
		
		time+=1000*60*60*24;
		/*
		 * void setTime(long time)
		 * ����һ��longֵ���ǵ�ǰDate��ʾ������
		 */
		date.setTime(time);
		System.out.println(date);
		
		
		
	}
}
