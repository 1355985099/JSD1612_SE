package day10;

public class Thread_join {
	public static  boolean isFinish = false;
	public static void main(String[] args) {
		 final Thread download = new Thread(){
			@Override
			public void run() {
				System.out.println("down：开始下载图片.....");
				for (int i = 1; i <= 100; i++) {
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("down:图片下载完毕");
				isFinish = true;
				super.run();
			}
		};
		Thread show = new Thread(){
			@Override
			public void run() {
				System.out.println("show:开始显示图片");
				try {
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("图片加载失败");
				}
				System.out.println("show:显示图片完毕！");
				super.run();
			}
		};
		download.start();
		show.start();
		
	}
}
