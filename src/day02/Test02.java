package day02;

public class Test02 {
	
	public static void main(String[] args) {
		
		String regex = "(wqnmlgb|cnm|nc|djb|mdzz|tmd|sb)";
		
		String message = "wqnmlgb!����ô��ô��nc!mdzz!�����djb!";
		
		message = message.replaceAll(regex, "***");
		
		System.out.println(message);
	}
}
