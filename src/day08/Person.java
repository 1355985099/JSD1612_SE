package day08;

import java.io.Serializable;
import java.util.List;

/**
 * ʹ�ø�����Զ���������Ķ�д����
 */
public class Person implements Serializable {
	/**
	 * ��һ����ʵ�������л��ӿ� serialVersionID �ó�����������ʾ��ǰ��İ汾�ţ���Ӱ��������л� �ɹ����Ľ��
	 * ��ʹ��ObjectInputStream �ڷ����л�һ������ʱ�� ����ö����뵱ǰ��汾���Ƿ� һ�£�һ�¾Ϳ��Է����л�����һ������׳��쳣
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * ��transient���ε����ԣ���ʹ�ö�����������л�ʱ����ֵ�ᱻ���� .�Ӷ��ﵽ���������Ŀ��
	 */
	private transient List<String> otherInfo;

	public Person() {

	}

	public Person(String name, int age, String gender, List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}

	@Override
	public String toString() {
		return name + ", " + age + ", " + gender + ", " + otherInfo;
	}

}
