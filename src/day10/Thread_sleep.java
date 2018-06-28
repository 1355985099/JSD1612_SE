package day10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread_sleep {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		while(true){
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
