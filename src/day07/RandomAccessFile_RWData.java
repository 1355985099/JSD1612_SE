package day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RAF��д������������ �Լ� RAF����ָ���д�Ĳ���
 * 
 * @author nijunran
 *
 */
public class RandomAccessFile_RWData {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		/*
		 *��ȡָ���λ��
		 */
		long pos = raf.getFilePointer();
		System.out.println("pos:" + pos);
		
		int max = Integer.MAX_VALUE;
		/*
		 * void write(max); һ��ֻдһ���ֽ�
		 */
		raf.write(max >>> 24);
		System.out.println("pos:" + raf.getFilePointer());
		raf.write(max >>> 16);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(max >>> 8);
		System.out.println("pos:" + raf.getFilePointer());
		raf.write(max);
		System.out.println("pos:"+raf.getFilePointer());
		

		/*
		 * void writInt(max); һ��д�ĸ��ֽ�
		 */
		raf.writeInt(max);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeLong(123L);
		System.out.println("pos:" + raf.getFilePointer());
		
		raf.writeDouble(123.123);
		System.out.println("pos:" + raf.getFilePointer());
		/*
		 * void seek(long pos) ��ָ���ƶ���ָ��λ��
		 */
		raf.seek(0);
		System.out.println("pos:" + raf.getFilePointer());
		/*
		 * EOF:end of file
		 */
		int d = raf.readInt();
		System.out.println(d);
		//��ȡlongֵ
		raf.seek(8);
		long l = raf.readLong();
		System.out.println(l);
		//��ȡdoubleֵ
		double dd = raf.readDouble();
		System.out.println(dd);//123.123
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.seek(0);
		l = raf.readLong();
		System.out.println(l);
				
		raf.close();

	}

}
