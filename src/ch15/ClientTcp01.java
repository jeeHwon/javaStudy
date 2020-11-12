package ch15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

//TCP 통신
//1. 서버는 서버소켓을 사용해서 서버의 특정포트에서 클라이언트의 연결요청을 처리할 준비를 한다
//2. 클라이언트는 접속할 서버의 IP주소와 포트정보로 소켓을 생성해서 서버에 연결을 요청한다.
//3. 서버소켓은 클라이언트의 연결요청을 받으면 서버에 새로운 소켓을 생성해서 클라이언트의 소켓과 연결되도록 한다
//4. 이제 클라이언트의 소켓과 새로 생성된 서버의 소켓은 서버소켓과 관계없이 1:1통신을 한다.
public class ClientTcp01 {
	
	public static void main(String[] args) {
		
		//2. 클라이언트는 접속할 서버의 IP주소와 포트정보로 소켓을 생성해서 서버에 연결을 요청한다.
		Socket socket = null;
		
		try {
			socket = new Socket();	//소켓을 생성
			socket.connect(new InetSocketAddress("localhost", 5002));
			System.out.println("[서버와 연결 성공]");
			
			//-------------------------------
			//서버로 보내기 위한 OutputStream
			String message = null;
			byte[] bytes = null;
			OutputStream os = socket.getOutputStream();
			message = "";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[서버에 메시지를 전송합니다]");
			
			//-----------------------------------------
			String msg = null;
			bytes = new byte[500];
			InputStream is = null;
			is = socket.getInputStream();
			int readByteCount = is.read(bytes);
			msg = new String(bytes, 0, readByteCount);
			System.out.println("[서버로부터의 응답메시지]: "+msg);
			is.close();
			
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
