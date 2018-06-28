package day11;

/**
 * synchronized也是互斥锁 当修饰的是两段不同的代码，但是同步监视器是同一个的时候，那么就有了互斥性
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
				System.out.println(t + ":正在执行A方法");
				Thread.sleep(5000);
				System.out.println(t + ":运行A方法完毕");
			} catch (Exception e) {
			}
		}

	}

	public synchronized void methodB() {
		Thread t = Thread.currentThread();
		try {
			System.out.println(t + ":正在执行B方法");
			Thread.sleep(5000);
			System.out.println(t + ":运行B方法完毕");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
