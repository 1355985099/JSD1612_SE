package day02;

public class Test02 {
	
	public static void main(String[] args) {
		
		String regex = "(wqnmlgb|cnm|nc|djb|mdzz|tmd|sb)";
		
		String message = "wqnmlgb!你怎么这么的nc!mdzz!你这个djb!";
		
		message = message.replaceAll(regex, "***");
		
		System.out.println(message);
	}
}
