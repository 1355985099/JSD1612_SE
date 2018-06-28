package day10;

public class Thread_info {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		long id = main.getId();
		System.out.println("id:"+id);
		
		String name = main.getName();
		System.out.println("name:"+name);
		//获取线程优先级
		int priority = main.getPriority();
		System.out.println("优先级："+priority);
		//获取线程是否处于活动状态
		boolean isalive = main.isAlive();
		System.out.println("isalive:"+isalive);
		//查看显示是否为守护线程
		boolean isdaemon = main.isDaemon();
		System.out.println("isDaemon:"+isdaemon);
		//查看线程是否是被中断的
		boolean isinterrupted = main.isInterrupted();
		System.out.println("isinterrupted:"+isinterrupted);
		
	}
}
