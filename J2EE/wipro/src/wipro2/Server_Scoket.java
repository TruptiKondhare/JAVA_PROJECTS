
package wipro2;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Server_Scoket {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		try {			
			ServerSocket ss =new ServerSocket(6666);			
			System.out.println("Server is waiting at port 6666");			
			Socket s=ss.accept();			
			DataInputStream dis= new DataInputStream(s.getInputStream());			
			String str=dis.readUTF();			
			System.out.println("Recevied data from client: "+str);			
			ss.close();										
			}catch(IOException ex){			
				System.out.println(ex);					
				}
}
}