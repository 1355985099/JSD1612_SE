package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.omg.Messaging.SyncScopeHelper;

/**
 * �����ļ�
 * @author nijunran
 *
 */
public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile src = new RandomAccessFile("raf.dat","r");
		RandomAccessFile desc = new RandomAccessFile("raf_cp.dat","rw");
		//����ÿ�ζ�ȡ�����ֽ�
		int d =-1;
		long start = System.currentTimeMillis();
		while((d=src.read())!=-1){
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(end-start));
		
		src.close();
		desc.close();
	}
}
