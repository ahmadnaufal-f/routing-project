package routing;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//accept input from client, and return to client.
		//need socket in server but different from client
		int number,temp;
		
		ServerSocket s1 = new ServerSocket(8888); //mjust same port as the client port
		Socket sct = s1.accept();
		Scanner sc = new Scanner(sct.getInputStream());
		number=sc.nextInt();
		
		temp = number*2;
		
		PrintStream p=new PrintStream(sct.getOutputStream());
		p.println(temp);
		
		
		
	}

}
