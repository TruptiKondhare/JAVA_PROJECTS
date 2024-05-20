package wipro2;




import java.net.Socket;

import java.io.DataOutputStream;

import java.io.IOException;



public class ClientSocket {

	public static void main(String args[]){

		try {

			Socket s=new Socket("localhost",6666);

			DataOutputStream dos =new DataOutputStream(s.getOutputStream());

			dos.writeUTF("Hello java.");

			dos.flush();

		}catch(IOException ex){

			System.out.println(ex);

			

		}

	}



}


