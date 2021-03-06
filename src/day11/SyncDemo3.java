package day11;

/**
 * 静态方法上使用synchornized后，该方法一定具有同步效果。 
 * 实际上上锁的对象为当前方法所属类的类对象，即：Class的一个实例。
 * Classl类的每一个实例是用于描述JVM加载的一个类，并保存在JVM内部
 * JVM在加载一个类时会实例化一个Class,
 * 并且，每个类有且只要一个Class实例与之对应，
 * 在该Class内部记录了这个类的信息，如：有哪些方法，属性等.
 * 
 * @author nijunran
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Foo foo = new Foo();
		Thread t1 = new Thread(){
			public void run() {
				Foo.dosome();
			}
		};
		Thread t2 = new Thread(){
			public void run() {
				Foo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}
class Foo{
	public synchronized static void dosome(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t+":正在执行dosome方法");
			Thread.sleep(5000);
			System.out.println(t+":执行dosome方法");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
