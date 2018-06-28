package day10;

public class Thread_join {
	public static  boolean isFinish = false;
	public static void main(String[] args) {
		 final Thread download = new Thread(){
			@Override
			public void run() {
				System.out.println("down����ʼ����ͼƬ.....");
				for (int i = 1; i <= 100; i++) {
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("down:ͼƬ�������");
				isFinish = true;
				super.run();
			}
		};
		Thread show = new Thread(){
			@Override
			public void run() {
				System.out.println("show:��ʼ��ʾͼƬ");
				try {
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("ͼƬ����ʧ��");
				}
				System.out.println("show:��ʾͼƬ��ϣ�");
				super.run();
			}
		};
		download.start();
		show.start();
		
	}
}
