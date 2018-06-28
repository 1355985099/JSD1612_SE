package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map ���ұ� ����ʵ���ࣺHashMap ɢ�б���ϣ�� Map�洢Ԫ�����ԡ���ֵ�ԡ�����ʽ�洢
 * ����key�������ظ���equals�Ƚϣ�
 * 
 * @author nijunran
 *
 */
public class MapDemo1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		/**
		 * V put(K k,V v) 
		 * ��������key-value�Դ��뵽Map�� ����ֵΪ���滻��value.
		 * ����Map���������ظ���key��
		 * ���ԣ��������ֵ����Map�У������滻value,����ֵ���Ǳ��滻��value
		 * �������key��Map�в����ڣ�
		 * �򷵻�ֵΪNULL
		 */
		Integer value1 = map.put("����",99);
		System.out.println(value1);
		map.put("��ѧ",98);
		map.put("Ӣ��",97);
		map.put("����",96);
		map.put("��ѧ",99);
		System.out.println(map);
		
		/**
		 * ��ͬ��key���滻value
		 * Map�ڽ���put�����ķ���ֵҪע�⣬��
		 * value�ǻ������Ͷ�Ӧ�İ�װ������ʱ��
		 * Ӧ���ð�װ��������գ������Զ����䣬
		 * ����������ֵΪNULL�Զ������������ָ��
		 */
		Integer value = map.put("��ѧ", 88);
		System.out.println(map);
		System.out.println(value);
		
		/*
		 * V get(K k)
		 * ���ݸ�����key��ȡ��Ӧ��value
		 */
		value =map.get("����");
		System.out.println("���ģ�"+value);
		/*		
		 * V remove(K k)
		 * ���ݸ�����keyɾ�������ֵ��
		 * ����ֵΪ�����ֵ���е�value
		 * ��û�У��򷵻�ֵΪNULL
		 */
		Integer old = map.remove("����");
		System.out.println(map);
		System.out.println("old:"+old);
		
	}

}
