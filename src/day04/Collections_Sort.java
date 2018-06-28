package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * java.util.Collections
 * 该类是集合的工具类,提供了很多静态方法便于操作
 * 集合
 * 
 * @author adminitartor
 *
 */
public class Collections_Sort {
	public static void main(String[] args) {
		List<Integer> list
			= new ArrayList<Integer>();
		
		Random random = new Random();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}








