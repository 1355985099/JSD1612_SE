package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * �����ҿͻ���
 * 
 * @author nijunran
 *
 */
public class Client {
	/**
	 * java.net.Socket ��װ��TCPͨѶЭ�飬ʹ�ø�����ɻ���TCPͨѶ�Ĳ���
	 */
	private Socket socket;

	/*
	 * ���췽����������ʼ���ͻ���
	 */
	public Client() throws UnknownHostException, IOException {
		/**
		 * ʵ����Socket��Ҫ������������ 1������˵�ip��ַ 2������˵Ķ˿ں� �˿ں����������ӷ���˼�����ϵķ����Ӧ�ó���
		 * ʵ����socket�Ĺ��̾������ӵĹ��̣������������û����Ӧ������׳��쳣��
		 */
		System.out.println("�������ӷ����......");
		socket = new Socket("LocalHost", 8088);
		System.out.println("�����ӷ���ˣ�");
	}

	/*
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start() {
		try {
			Scanner scanner = new Scanner(System.in);

			/**
			 * ����Ҫ���û�����һ���س� �ǳ�����һ���ַ��������ǿհף�
			 */
			
//			String nickName = "";
//			while (true) {
//				System.out.println("��������ɶ������");
//				nickName = scanner.nextLine();
//				if (nickName.trim().length() > 0) {
//					break;
//				}
//				System.out.println("����������һ���ַ�");
//			}

			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
			PrintWriter pw = new PrintWriter(osw, true);

			// �ȵ���������˷���һ����Ϣ�������ǳ�

			/**
			 * ����������ȡ�������Ϣ���߳�
			 */
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();

			String message = "�Ҿ���һ������";

			while (true) {
				pw.println(message);
				message = scanner.nextLine();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		try {
			Client client = new Client();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ͻ�������ʧ��");
		}

	}

	private class ServerHandler implements Runnable {
		@Override
		public void run() {
			try {
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				/**
				 * 
				 */
				String message = null;
				while ((message = br.readLine()) != null) {
					System.out.println(message);
				}
			} catch (Exception e) {
				
			}

		}
	}
}
