package day09;

/**
 * 异常处理机制中的throw throw是用来主动向外抛出异常的。 tc下面两种情况会抛出异常：
 * 1：程序遇到一个满足语法要求，但是不满足业务逻辑要求的操作时，可以主动抛出异常通知调用者
 * 2：在当前代码片段中出现了异常，但是当前代码片段不应当解决该异常时，可以抛出给调用者解决
 * 
 * @author nijunran
 *
 */
public class Exception_throw {
	public static void main(String[] args) {
		Person person = new Person();
		try {
			person.setAge(2000);
		} catch (IllegaAgeException e) {
			// TODO Auto-generated catch block
			System.out.println("出错了");
		}
		System.out.println("你的年龄" + person.getAge());
	}
}

class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegaAgeException {
		if (age < 0 || age > 100) {
			throw new RuntimeException("年龄不合法");
		}
		this.age = age;
	}

}
