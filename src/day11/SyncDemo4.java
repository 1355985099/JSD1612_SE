package day11;

/**
 * synchronizedҲ�ǻ����� �����ε������β�ͬ�Ĵ��룬����ͬ����������ͬһ����ʱ����ô�����˻�����
 * 
 * @author nijunran
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		final Boo boo = new Boo();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				boo.methodA();
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				boo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}

class Boo {
	public void methodA() {
		Thread t = Thread.currentThread();
		synchronized (this) {
			try {
				System.out.println(t + ":����ִ��A����");
				Thread.sleep(5000);
				System.out.println(t + ":����A�������");
			} catch (Exception e) {
			}
		}

	}

	public synchronized void methodB() {
		Thread t = Thread.currentThread();
		try {
			System.out.println(t + ":����ִ��B����");
			Thread.sleep(5000);
			System.out.println(t + ":����B�������");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
