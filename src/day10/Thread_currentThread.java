package day10;

/**
 * �߳��ṩ��һ����̬������ static Thread currentThread �÷������Ի�ȡ���и÷������߳�
 * 
 * @author nijunran
 *
 */
public class Thread_currentThread {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("���и÷������̣߳�" + main);
		dosome();
		new Thread() {
			@Override
			public void run() {
				Thread thread = Thread.currentThread();
				System.out.println("�Զ����̣߳�" + thread);
				dosome();
				super.run();
			}
		}.start();
	}

	public static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println("����dosome�������߳���" + t);
	}
}
