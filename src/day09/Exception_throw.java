package day09;

/**
 * �쳣��������е�throw throw���������������׳��쳣�ġ� tc��������������׳��쳣��
 * 1����������һ�������﷨Ҫ�󣬵��ǲ�����ҵ���߼�Ҫ��Ĳ���ʱ�����������׳��쳣֪ͨ������
 * 2���ڵ�ǰ����Ƭ���г������쳣�����ǵ�ǰ����Ƭ�β�Ӧ��������쳣ʱ�������׳��������߽��
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
			System.out.println("������");
		}
		System.out.println("�������" + person.getAge());
	}
}

class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegaAgeException {
		if (age < 0 || age > 100) {
			throw new RuntimeException("���䲻�Ϸ�");
		}
		this.age = age;
	}

}
