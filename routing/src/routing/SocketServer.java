package routing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer extends Thread {
	private BufferedReader input;
	private PrintWriter output;
	private Socket s;
	private Computer pc;
	
	public SocketServer(Socket s, Computer pc){
		this.s=s;
		this.pc=pc;
	}
	public void run(){
		try {
			this.output= new PrintWriter(s.getOutputStream(),true);
			this.input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String lineInput=input.readLine();
			pc.receive(lineInput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
