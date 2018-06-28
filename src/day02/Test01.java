package day02;

/**
 * Í¼Æ¬ÖØÃüÃû
 * 
 * @author nijunran
 *
 */
public class Test01 {
	public static void main(String[] args) {
		String imgName = "1.jpg";
		String[] name = imgName.split("\\.");
		imgName = System.currentTimeMillis() + "." + name[1];
		System.out.println(imgName);// .jpg
	}
}
