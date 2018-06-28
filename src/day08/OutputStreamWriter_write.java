package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Reader,Write 字符流 字符流的读写单位是以字符为单位的
 * 
 * 转换流： OutputStreamWriter InputStreamReader 所谓转换流是因为其他字符流都只能处理字符流，而
 * 低级流通常都是字节流，导致不能字节连接，但是 转换流提供的构造方法允许我们将它连接字节流， 而转换流本身又是字符流
 * ，所有通常在将其他字符流与字节流连接时要使用转换流进行过度
 * 
 * @author nijunran
 *
 */
public class OutputStreamWriter_write {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		osw.write("和我在成都的街头走一走");
		System.out.println("写出完毕");
		osw.close();
	}
}
