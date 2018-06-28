package day08;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流的缓冲区问题
 * @author nijunran
 */
public class BufferedOutputStream_flush {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "随便写点啥哦";
		bos.write(str.getBytes());
		/*
		 * void flush() 该方法会强制将缓冲区已缓冲的数据一次性写出
		 * 
		 */
		// bos.flush();
		System.out.println("写出完毕");
		bos.close();
	}

}
