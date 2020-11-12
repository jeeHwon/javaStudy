package ch15;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

//UDP 통신
//client 역할을 하는 클래스
public class ClientUdp01 {

	public static void main(String[] args) throws IOException {
		//client는 server랑 다르게 port 번호 입력 NO!
		DatagramSocket datagramSocket = new DatagramSocket();//DatagramSocket
		System.out.println("[(클라이언트) 발신 시작..]");
		
		for (int i = 0; i < 10; i++) {
			String data = "hey~ server"+i;
			byte[] bytes = data.getBytes("UTF-8");
			//new DatagramPacket(byte[] 보낼데이터, 
				//byte[]에서 보내고자 하는 항목수, 수신자IP와 port 정보를 가진 SocketAddress)
			DatagramPacket packet = new DatagramPacket(bytes,
					bytes.length,new InetSocketAddress("localhost",7777));
			
			//생성한 DatagramPacket을 보낸다
			datagramSocket.send(packet);
			System.out.println("[보낸 bytes 수: ]"+bytes.length+"(byte)");
			
		}
		System.out.println("[발신 종료]");
		datagramSocket.close();//DatagramSocket 닫기
	}

}
