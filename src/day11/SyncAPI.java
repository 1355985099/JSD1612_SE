package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ���õ��̰߳�ȫAPI String Builder �����̰߳�ȫ�ģ�StringBuffer���̰߳�ȫ�ġ�
 * ���ڼ��Ϻ�Map���ԣ�����ʹ��Collection��ߵľ�̬���������еĽ����̰߳�ȫ��ת��
 * 
 * @author nijunran
 *
 */
public class SyncAPI {
	public static void main(String[] args) {
		/*
		 * ArrayList,LinkedList �������̰߳�ȫ��
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);
		/*
		 * �������ļ���ת��Ϊһ���̰߳�ȫ��KList��
		 */
		list = Collections.synchronizedList(list);
		System.out.println(list);
		/*
		 * HashSet�����̰߳�ȫ��
		 */
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
		/*
		 * ��������Set����ת��Ϊ�̰߳�ȫ��
		 */
		set = Collections.synchronizedSet(set);
		System.out.println(set);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 99);
		System.out.println(map);
		// ��������Mapת��Ϊ�̰߳�ȫ��
		map = Collections.synchronizedMap(map);
		System.out.println(map);
		/*
		 * ���ڼ��ϲ������ԣ��̰߳�ȫ�ļ���Ҳ���Ա�������ɾ���⡣ ���Ե�ʹ�õ�������������ʽ��Ӧ����ά���뼯����ɾԪ�ز������Ļ���
		 */

	}
}
