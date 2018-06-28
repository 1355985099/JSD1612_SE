package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("«Î ‰»Î…˙»’:yyyy-MM-dd");
		String str = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		
		long birth = date.getTime();
		long  now = System.currentTimeMillis();
		System.out.println(( now - birth) / 1000 / 60 / 60 / 24);

	}
}
