package routing;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread{

	
	
	ServerSocket s1; //mjust same port as the client port
	
	Computer pc;
	 //storing number
	public Server(int port,Computer pc) throws IOException{
		this.s1=new ServerSocket(port);
		this.pc = pc;
	}
	
	
	

	
	public void run() {
		// TODO Auto-generated method stub
		try {
			SocketServer ss = new SocketServer(s1.accept(),pc);
			ss.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


