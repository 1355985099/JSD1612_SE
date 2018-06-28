package day08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream
 * 对象被反序列化
 * @author nijunran
 *
 */
public class ObjectInputStream_readObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("person.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person person  = (Person)ois.readObject();
		System.out.println(person);
		
	}
}
