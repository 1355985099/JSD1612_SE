package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * java.io.ObjectOutputStream 对象输出流，是一个高级流 
 * 功能：可以将给定的对象转换为一组字节后输出
 * 
 * @author nijunran
 *
 */
public class ObjectOutputStream_writeObject {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("苍老师");
		p.setAge(18);
		p.setGender("女");
		List<String> otherInfo = new ArrayList<String>();
		otherInfo.add("是一名演员");
		otherInfo.add("爱好写毛笔字");
		otherInfo.add("促进中日文化交流");
		otherInfo.add("广大男性同胞的启蒙老师");
		p.setOtherInfo(otherInfo);
		System.out.println(p);//toString方法
		FileOutputStream fos = new FileOutputStream("person.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * ObjectOutputStream 提供了写出对象的方法，但是该方法要求对象所属类必须实现可序列化接口
		 * 将一个对象转换为一组字节的过程，称为： 对象序列化
		 * 将数据写入到磁盘上的过程称为：持久化
		 */
		oos.writeObject(p);
		System.out.println("写出对象完毕");
		oos.close();

	}
}
