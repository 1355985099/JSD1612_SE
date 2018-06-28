package day10;

/**
 * �߳����ȼ� �̵߳����ȼ���10���ȼ�����Ӧ10�������� �ֱ�Ϊ1-10 ����1Ϊ������ȼ���10Ϊ������ȼ���5ΪĬ�����ȼ� ��3��������Ӧ��
 * MIN_PRIORITY,MAX_PRIORITY:NORM_PRIORITY
 *
 * �������߳����ȼ�Խ�ߵ��̻߳�ȡcpuʱ��Ƭ�Ĵ�����Խ��
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
