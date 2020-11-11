package ch15;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("mycom IPv4 주소: "+local.getHostAddress());//192.168.0.8
			
			String host = "www.naver.com";
			InetAddress[] inetArr = InetAddress.getAllByName(host);
			for (InetAddress i : inetArr) {
				System.out.println(host+"의 IP:"+i.getHostAddress());
				
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
