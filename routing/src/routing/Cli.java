package routing;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
public class Cli {

	
	public static void main(String args[]) throws UnknownHostException, IOException{
		//client server
	int number,temp;
	Scanner scan = new Scanner(System.in);	
	Socket sc = new Socket("127.0.0.1",8888);
	Scanner scan1 = new Scanner(sc.getInputStream()); //accept result from the server
	System.out.println("Enter any number");
	number = scan.nextInt();
	PrintStream p = new PrintStream(sc.getOutputStream()); //passing number to the server
	p.println(number);
	//p passing the number to socket.
	temp = scan1.nextInt(); 
	System.out.println(temp);
	
		
	}
	
}
