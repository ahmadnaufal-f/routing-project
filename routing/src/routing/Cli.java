package routing;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
public class Cli extends Thread{
	private BufferedReader input;
	private PrintStream output;
	private Socket sc;
	private String message;
	//int port;
	public Cli(String ip,int port,String message) throws UnknownHostException, IOException{
		
		this.sc = new Socket(ip,port);
		this.message=message;
		
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			input = new BufferedReader(new InputStreamReader(sc.getInputStream())); //accept result from the server
			output = new PrintStream(sc.getOutputStream()); //passing number to the server
			output.println(message);
			String inputMessage = input.readLine();
			//p passing the number to socket.
			
			System.out.println(inputMessage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		//client server
	
	
		
	
	
}
