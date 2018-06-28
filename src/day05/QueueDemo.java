package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * ���У�������һ��Ԫ�أ����Ǵ�ȡ������ѭ�Ƚ��ȳ�ԭ��
 * ����Ҳ�Ǽ��ϵ�һ�������ͣ�����Collection����ط���
 * ��Ҳ�߱�
 * @author nijunran
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		/*
		 * bollean offer(E e)
		 * ��Ӳ��������β׷��Ԫ�� 
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		/*
		 * E poll()
		 * ���Ӳ�������ȡ����Ԫ�أ�������Ԫ�شӶ�����ɾ��
		 */
		String str = queue.poll();
		System.out.println(str);//one
		System.out.println(queue);
		/*
		 * E peek()
		 * ��ȡ�����Ƴ��˶��е�ͷ
		 */
		str = queue.peek();
		System.out.println(str);//two
		System.out.println(queue);
		/*
		 * ����QueueҲ�Ǽ��ϣ����Կ���ʹ�õ�������������Ԫ��
		 */
		for (String s:queue) {
			System.out.println(s);
		}
		System.out.println(queue);
		System.out.println("��ʼ����");
		while (queue.size()>0) {
			str=queue.poll();
			System.out.println(str);
		}
		System.out.println("�������");
		System.out.println(queue);
	}
}
