package day10;

/**
 * 线程优先级 线程的优先级有10个等级，对应10个整数， 分别为1-10 其中1为最低优先级，10为最高优先级，5为默认优先级 有3个常量对应：
 * MIN_PRIORITY,MAX_PRIORITY:NORM_PRIORITY
 *
 * 理论上线程优先级越高的线程获取cpu时间片的次数就越多
 */
public class Thread_priority {

	public static void main(String[] args) {
		Thread max = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("max");
				}
				super.run();
			}
		};
		Thread mid = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("mid");
				}
				super.run();
			}
		};
		Thread min = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 2 ; i++) {
					System.out.println("min");
				}
				super.run();
			}
		};
		min.setPriority(1);
		max.setPriority(10);
		min.start();
		mid.start();
		max.start();

	}

}
