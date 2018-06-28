package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 聊天室服务端
 * 
 * @author nijunran
 *
 */
public class Server {
	/**
	 * java.net.ServerSocket 运行在服务端的ServerSocket主要有两个工作：
	 * 1：向系统申请服务端口，客户端就是通过该端口与服务端程序连接的 2：监听服务端口，一旦客户端建立连接，就会创建一个Socket与该客户端通讯
	 */
	private ServerSocket server;
	private List<PrintWriter> allOut;

	public Server() throws IOException {
		/**
		 * 实例化需要指定服务端口 若当前操作系统的其他程序已经使用该端口了 那么这里会抛出异常
		 */
		server = new ServerSocket(8088);
		allOut = new ArrayList<PrintWriter>();
	}

	/**
	 * 将给定的消息转发给所有客户端
	 * 
	 * @param message
	 */
	public void sendMessage(String message) {
		synchronized (allOut) {
			for (PrintWriter pw : allOut) {
				pw.println(message);
			}
		}
	}

	public void start() {
		try {
			/**
			 * Socket accept() 该方法是一个阻塞方法，作用是监听申请的服务端口。等待客户端的连接，
			 * 一旦客户端通过该端口连接，那么accept方法会返回一个Socket，使用该Socket就可以与建立连接的客户端进行通讯了
			 */
			while (true) {
				System.out.println("等待客户端连接......");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了！");
				// 启动线程来完成与客户端的交互
				ClientHandler clientHandler = new ClientHandler(socket);
				Thread t = new Thread(clientHandler);
				t.start();
			}

		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("启动失败！");
		}
	}

	private class ClientHandler implements Runnable {
		/**
		 * 当前线程要处理的客户端rocket
		 */
		private Socket socket;
		private String host;
		private String nickName;

		public ClientHandler(Socket socket) {
			this.socket = socket;
			/**
			 * 通过Socket获取远端计算机地址信息 对于服务端而言，远端计算机就是客户端的计算机
			 */
			InetAddress address = socket.getInetAddress();
			// 获取IP地址的字符串形式
			host = address.getHostAddress();
		}

		@Override
		public void run() {
			PrintWriter pw = null;
			try {
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				nickName = br.readLine();
				String message = null;

				OutputStream out = this.socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
				pw = new PrintWriter(osw, true);

				// 将该客户端的输出流存入共享集合
				synchronized (allOut) {
					allOut.add(pw);
				}

				sendMessage("[" + nickName+ "]上线了! 当前在线：" + allOut.size() + "人");
				/**
				 * 在读取客户端消息时，由于客户端断开连接，不同的系统在这里导致的结果不同。
				 * 当Linux的客户端断开连接后：这里br.readLine()会返回null. 当windows的
				 * 客户端断开连接后，这里br.readLine()会抛出异常
				 */
				while ((message = br.readLine()) != null) {
					// 转发给所以客户端
					sendMessage(nickName + "：" + message);
				}
			} catch (Exception e) {
				
			} finally {
				// 这这里处理客户端断开的操作
				// 将该客户端的输出流从共享集合中删除
				synchronized (allOut) {
					allOut.remove(pw);
				}
				sendMessage("[" + nickName + "]下线了 ! 当前在线：" + allOut.size() + "人");
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
