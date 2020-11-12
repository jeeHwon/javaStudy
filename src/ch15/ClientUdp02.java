package ch15;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

//UDP통신
//client역할을 하는 클래스
public class ClientUdp02 {

	public static void main(String[] args) throws Exception {
		DatagramSocket  datagramSocket = new DatagramSocket();//DatagramSocket생성
		
		System.out.println("[(클라이언트가)발신 시작합니다]");
		
		for(int i=0; i<5 ;i++) {
			String data = "서버야"+i;
			byte[] byteArr = data.getBytes("UTF-8");
			
			//DatagramPacket생성 
			/*new DatagramPacket( byte[] 보낼데이터,
								  byte[]에서 보내고자 하는 항목 수 
								   만약 전체 항목을 보내고 싶다면 byte[].length를 쓴다,
								  수신자 IP와 port정보를 가지고 있는 SocketAddress
								   SocketAddresss는 추상클래스이므로  
								      하위클래스인  InetSocketAddress객체를 생성해서 대입한다 
									  new InetSocketAddress("localhost",7777)
						             );	 */
			DatagramPacket packet 
				= new DatagramPacket( byteArr,
									  byteArr.length,
									  new InetSocketAddress("localhost",7777)
						             );
			
			//생성한 DatagramPacket을 보낸다
			datagramSocket.send(packet);
			
			System.out.println("[보낸 byte수 : "+byteArr.length+"(byte)]");
		}
		
		System.out.println("[발신 종료-]");
		
		datagramSocket.close(); //DatagramSocket 닫기
	}

}