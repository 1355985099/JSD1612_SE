package day10;

public class Test {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("����˭��");
				}
				super.run();
			}
		}.start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("���ǲ�ˮ���");
				}

			}
		}).start();
	}
}
