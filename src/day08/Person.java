package day08;

import java.io.Serializable;
import java.util.List;

/**
 * 使用该类测试对象流对象的读写操作
 */
public class Person implements Serializable {
	/**
	 * 当一个类实现了序列化接口 serialVersionID 该常量是用来表示当前类的版本号，它影响对象反序列化 成功与否的结果
	 * 当使用ObjectInputStream 在反序列化一个对象时， 会检查该对象与当前类版本号是否 一致，一致就可以反序列化，不一致则会抛出异常
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * 被transient修饰的属性，在使用对象输出流序列化时，该值会被忽略 .从而达到对象瘦身的目的
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
