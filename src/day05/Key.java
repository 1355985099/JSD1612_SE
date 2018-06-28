package day05;
/**
 * ��ΪMap��key��Ԫ�أ�equals������hashcode��������д׼��
 * java�ṩ���಻��Ҫ���ǣ�ֻ���Զ�����������д��Ҫע��
 * 
 * ��������дһ�����equals����ʱ��Ӧ����ͬ��д
 * hashcode���������������������㣺
 * 1��һ���ԣ���������������equals�Ƚ�Ϊtrue����ôhashcodeֵӦ����ȡ���֮��Ȼ
 * 	��Ϊ����������hashcodeֵ��ȣ�����equals�Ƚ�Ϊfalse,��ô��hashMap�л��������
 *  Ӱ���ѯ����
 * 2���ɶ���д������дequals ��Ӧ����дhashcode
 * @author nijunran
 *
 */
public class Key extends MapDemo2 {
		private int x;
		private int y;
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Key other = (Key) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
}
