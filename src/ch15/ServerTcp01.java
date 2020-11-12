package ch15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//TCP 통신
//서버쪽 역할을 하는 클래스
//1. 서버는 서버소켓을 사용해서 서버의 특정포트에서 클라이언트의 연결요청을 처리할 준비를 한다
//2. 클라이언트는 접속할 서버의 IP주소와 포트정보로 소켓을 생성해서 서버에 연결을 요청한다.
//3. 서버소켓은 클라이언트의 연결요청을 받으면 서버에 새로운 소켓을 생성해서 클라이언트의 소켓과 연결되도록 한다
//4. 이제 클라이언트의 소켓과 새로 생성된 서버의 소켓은 서버소켓과 관계없이 1:1통신을 한다.
public class ServerTcp01 {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {//1. 서버는 서버소켓을 사용해서 서버의 특정포트에서		
			server = new ServerSocket();	//ServerSocket 생성
			//portBinding 위해 bind() 메서드를 호출
			server.bind(new InetSocketAddress("localhost",5002));
			
			while(true) {
				
				System.out.println("[클라이언트의 연결을 기다리는 중..]");
				
				//클라이언트의 연결요청을 처리할 준비를 한다
				Socket socket = server.accept();//클라이언트의 연결수락
				System.out.println("[클라이언트의 연결수락]");
				
				//--------------------------------
				byte[] bytes = new byte[500];
				InputStream is = null;
				is = socket.getInputStream();
				int readByteCount = is.read(bytes);
				
				String receivedMsg = new String(bytes, 0, readByteCount);
				InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();//연결된 시스템에 대한 주소를 받기
				System.out.println(isa.getHostName()+"[클라이언트로부터 받은 메시지]: "+receivedMsg);
				
				//-----------------------
				//클라이언트에게 보내기 위한 OutputStream
				String message = null;
				bytes = null;
				OutputStream os = socket.getOutputStream();
				message = "HiHi client~ I got it";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[클라이언트에 메시지를 전송합니다]");
				is.close();
				os.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (!server.isClosed()) {//연결이 되고 있을 경우라면
			try {
				server.close();	//연결끊기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
