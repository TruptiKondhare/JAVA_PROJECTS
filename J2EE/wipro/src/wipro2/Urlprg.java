
package wipro2;
import java.net.MalformedURLException;import java.net.URL;
public class Urlprg {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		URL url;		
		try {			
			url=new URL ("http://www.google.com");			
			System.out.println("Protocal: "+url.getProtocol());			
			System.out.println("Host Name : "+url.getHost());
					}catch (MalformedURLException e) {			
						e.printStackTrace();					}
	}
}