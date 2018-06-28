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
 * 聊天室客户端
 * 
 * @author nijunran
 *
 */
public class Client {
	/**
	 * java.net.Socket 封装了TCP通讯协议，使用该类完成基于TCP通讯的操作
	 */
	private Socket socket;

	/*
	 * 构造方法，用来初始化客户端
	 */
	public Client() throws UnknownHostException, IOException {
		/**
		 * 实例化Socket需要传入两个参数 1：服务端的ip地址 2：服务端的端口号 端口号是用来连接服务端计算机上的服务端应用程序
		 * 实例化socket的过程就是连接的过程，所以若服务端没有响应这里会抛出异常。
		 */
		System.out.println("正在连接服务端......");
		socket = new Socket("LocalHost", 8088);
		System.out.println("已连接服务端！");
	}

	/*
	 * 客户端开始工作的方法
	 */
	public void start() {
		try {
			Scanner scanner = new Scanner(System.in);

			/**
			 * 首先要求用户输入一个呢称 昵称至少一个字符（不能是空白）
			 */
			
//			String nickName = "";
//			while (true) {
//				System.out.println("老铁，叫啥名啊！");
//				nickName = scanner.nextLine();
//				if (nickName.trim().length() > 0) {
//					break;
//				}
//				System.out.println("请输入至少一个字符");
//			}

			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
			PrintWriter pw = new PrintWriter(osw, true);

			// 先单独给服务端发送一个消息，就是昵称

			/**
			 * 启动用来读取服务端消息的线程
			 */
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();

			String message = "我就是一个浆糊";

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
			System.out.println("客户端启动失败");
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
