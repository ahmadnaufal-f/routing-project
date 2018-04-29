package routing;

import java.io.IOException;

public class Computer {
	Computer[] computers=new Computer[5];

	public void receive(String message){
		System.out.println(message);
	}
	public void send(String message,int port,Computer pc){
		int flag=0;
		do {
			try {
				flag=0;
				pc.listen(port);
				System.out.println(port);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				flag=1;
				port++;
				e.printStackTrace();
			}
		} while (flag==1);
		
		try {
			Cli client = new Cli("127.0.0.1", port, message);
			client.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void listen(int port) throws IOException{
		
		Server s = new Server(port, this);
		s.start();
		
	}
}
