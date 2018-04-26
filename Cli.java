package routing;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
public class Cli {

	
	public static void main(String args[]) throws UnknownHostException, IOException{
	int number;
	Scanner scan = new Scanner(System.in);	
	Socket sc = new Socket("127.0.0.1",323);
	Scanner scan1 = new Scanner(sc.getInputStream());
	System.out.println("Enter any number");
	number = scan.nextInt();
	PrintStream p = new PrintStream(sc.getOutputStream());
	
		//halo
	}
	
}
