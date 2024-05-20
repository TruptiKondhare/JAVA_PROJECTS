package wipro2;

import java.net.UnknownHostException;
import java.net.InetAddress;

public class InetAddressPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress IA=InetAddress.getByName("www.google.com");
			System.out.println("Host name:"+IA.getHostName());
			System.out.println("IP Address :"+IA.getHostAddress());

		}catch(UnknownHostException e) {
			e.printStackTrace();
			
		}

	}

}
