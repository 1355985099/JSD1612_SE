package day10;

/**
 * �߳�
 * 
 * ��������ִ�ж������
 * 
 * @author nijunran
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2= new MyThread2();
		t1.start();
		t2.start();
	}
}

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("����˭��");
		}
	}
}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i <2; i++) {
			System.out.println("���ǲ�ˮ����");
		}

	}
}