package wiproProxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

class ResponseHandler1 implements java.util.Observer{
	private String resp;
	public void update(Observable obj,Object arg)
	{
		if (arg instanceof String) {
			resp=(String) arg;
			System.out.println("\n Recevied Response fron handler 1::"+resp);
		}
	}
}
class ResponseHandler2 implements java.util.Observer{
	private String resp;
	public void update (Observable obj,Object arg) {
		if (arg instanceof String) {
			resp=(String) arg;
			System.out.println("\n Recevied Response fron handler 2::"+resp);
		}
	}
}

class EventSource extends Observable implements Runnable{
	@Override
	public void run() {
		try {
			final InputStreamReader isr=new InputStreamReader(System.in);
			final BufferedReader br =new BufferedReader(isr);
			while(true) {
				String response=br.readLine();
				setChanged();
				notifyObservers(response);
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
public class ObserverPattern {
	public static void main (String args[]) {
		System.out.println("Enter Text > ");
		
		final EventSource eventSource=new EventSource();
		final ResponseHandler1 responseHandler1=new ResponseHandler1();
		
		eventSource.addObserver(responseHandler1);
		
		final ResponseHandler2 responseHandler2=new ResponseHandler2();
		
		eventSource.addObserver(responseHandler2);
		
		Thread thread=new Thread(eventSource);
		thread.start();
		
	}

}
