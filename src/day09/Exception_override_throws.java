package day09;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ���෽����д���ຬ��throws�쳣�׳������ķ���ʱ��throw��д׼��
 * 
 * @author nijunran
 *
 */
public class Exception_override_throws {
	public void dosome() throws IOException, AWTException {

	}
}

class Son extends Exception_override_throws {
	// �������׳��κ��쳣
	public void dosom() {

	}

	// �����׳������쳣
	public void doso() throws IOException {

	}

	// �����׳��������쳣
	public void dos() throws FileNotFoundException {

	}
	//�������׳������쳣
//	public void dO() throws SQLException {
//		
//	}

	// �������׳��������쳣
	public void d() throws Exception {

	}

}
