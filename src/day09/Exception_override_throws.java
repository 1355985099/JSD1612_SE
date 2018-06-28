package day09;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 子类方法重写父类含有throws异常抛出声明的方法时的throw重写准则
 * 
 * @author nijunran
 *
 */
public class Exception_override_throws {
	public void dosome() throws IOException, AWTException {

	}
}

class Son extends Exception_override_throws {
	// 允许不再抛出任何异常
	public void dosom() {

	}

	// 允许抛出部分异常
	public void doso() throws IOException {

	}

	// 允许抛出子类型异常
	public void dos() throws FileNotFoundException {

	}
	//不允许抛出额外异常
//	public void dO() throws SQLException {
//		
//	}

	// 不允许抛出父类型异常
	public void d() throws Exception {

	}

}
