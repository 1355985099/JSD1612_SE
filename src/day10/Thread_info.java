package day10;

public class Thread_info {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		long id = main.getId();
		System.out.println("id:"+id);
		
		String name = main.getName();
		System.out.println("name:"+name);
		//��ȡ�߳����ȼ�
		int priority = main.getPriority();
		System.out.println("���ȼ���"+priority);
		//��ȡ�߳��Ƿ��ڻ״̬
		boolean isalive = main.isAlive();
		System.out.println("isalive:"+isalive);
		//�鿴��ʾ�Ƿ�Ϊ�ػ��߳�
		boolean isdaemon = main.isDaemon();
		System.out.println("isDaemon:"+isdaemon);
		//�鿴�߳��Ƿ��Ǳ��жϵ�
		boolean isinterrupted = main.isInterrupted();
		System.out.println("isinterrupted:"+isinterrupted);
		
	}
}
