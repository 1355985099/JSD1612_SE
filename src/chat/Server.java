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
 * �����ҷ����
 * 
 * @author nijunran
 *
 */
public class Server {
	/**
	 * java.net.ServerSocket �����ڷ���˵�ServerSocket��Ҫ������������
	 * 1����ϵͳ�������˿ڣ��ͻ��˾���ͨ���ö˿������˳������ӵ� 2����������˿ڣ�һ���ͻ��˽������ӣ��ͻᴴ��һ��Socket��ÿͻ���ͨѶ
	 */
	private ServerSocket server;
	private List<PrintWriter> allOut;

	public Server() throws IOException {
		/**
		 * ʵ������Ҫָ������˿� ����ǰ����ϵͳ�����������Ѿ�ʹ�øö˿��� ��ô������׳��쳣
		 */
		server = new ServerSocket(8088);
		allOut = new ArrayList<PrintWriter>();
	}

	/**
	 * ����������Ϣת�������пͻ���
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
			 * Socket accept() �÷�����һ�����������������Ǽ�������ķ���˿ڡ��ȴ��ͻ��˵����ӣ�
			 * һ���ͻ���ͨ���ö˿����ӣ���ôaccept�����᷵��һ��Socket��ʹ�ø�Socket�Ϳ����뽨�����ӵĿͻ��˽���ͨѶ��
			 */
			while (true) {
				System.out.println("�ȴ��ͻ�������......");
				Socket socket = server.accept();
				System.out.println("һ���ͻ��������ˣ�");
				// �����߳��������ͻ��˵Ľ���
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
			System.out.println("����ʧ�ܣ�");
		}
	}

	private class ClientHandler implements Runnable {
		/**
		 * ��ǰ�߳�Ҫ����Ŀͻ���rocket
		 */
		private Socket socket;
		private String host;
		private String nickName;

		public ClientHandler(Socket socket) {
			this.socket = socket;
			/**
			 * ͨ��Socket��ȡԶ�˼������ַ��Ϣ ���ڷ���˶��ԣ�Զ�˼�������ǿͻ��˵ļ����
			 */
			InetAddress address = socket.getInetAddress();
			// ��ȡIP��ַ���ַ�����ʽ
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

				// ���ÿͻ��˵���������빲����
				synchronized (allOut) {
					allOut.add(pw);
				}

				sendMessage("[" + nickName+ "]������! ��ǰ���ߣ�" + allOut.size() + "��");
				/**
				 * �ڶ�ȡ�ͻ�����Ϣʱ�����ڿͻ��˶Ͽ����ӣ���ͬ��ϵͳ�����ﵼ�µĽ����ͬ��
				 * ��Linux�Ŀͻ��˶Ͽ����Ӻ�����br.readLine()�᷵��null. ��windows��
				 * �ͻ��˶Ͽ����Ӻ�����br.readLine()���׳��쳣
				 */
				while ((message = br.readLine()) != null) {
					// ת�������Կͻ���
					sendMessage(nickName + "��" + message);
				}
			} catch (Exception e) {
				
			} finally {
				// �����ﴦ��ͻ��˶Ͽ��Ĳ���
				// ���ÿͻ��˵�������ӹ�������ɾ��
				synchronized (allOut) {
					allOut.remove(pw);
				}
				sendMessage("[" + nickName + "]������ ! ��ǰ���ߣ�" + allOut.size() + "��");
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
