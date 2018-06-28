package day10;

public class Thread_daemon {
	public static void main(String[] args) {
		/*
		 * 前台线程
		 */
		Thread rose = new Thread(){
			@Override
			public void run() {
				for (int i = 0; i <5; i++) {
					System.out.println("rose:let me go");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("rose: 啊啊啊啊啊");
				super.run();
			}
		};
		/*
		 * 后台线程：jack
		 */
		Thread jack = new Thread(){
			@Override
			public void run() {
				while(true){
					System.out.println("jack: you jump! i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
					}
				}
			}
		};
		jack.setDaemon(true);
		rose.start();
		jack.start();
		for( ; ; );
	}
}
