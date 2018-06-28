package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * java.io.ObjectOutputStream �������������һ���߼��� 
 * ���ܣ����Խ������Ķ���ת��Ϊһ���ֽں����
 * 
 * @author nijunran
 *
 */
public class ObjectOutputStream_writeObject {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("����ʦ");
		p.setAge(18);
		p.setGender("Ů");
		List<String> otherInfo = new ArrayList<String>();
		otherInfo.add("��һ����Ա");
		otherInfo.add("����дë����");
		otherInfo.add("�ٽ������Ļ�����");
		otherInfo.add("�������ͬ����������ʦ");
		p.setOtherInfo(otherInfo);
		System.out.println(p);//toString����
		FileOutputStream fos = new FileOutputStream("person.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * ObjectOutputStream �ṩ��д������ķ��������Ǹ÷���Ҫ��������������ʵ�ֿ����л��ӿ�
		 * ��һ������ת��Ϊһ���ֽڵĹ��̣���Ϊ�� �������л�
		 * ������д�뵽�����ϵĹ��̳�Ϊ���־û�
		 */
		oos.writeObject(p);
		System.out.println("д���������");
		oos.close();

	}
}
