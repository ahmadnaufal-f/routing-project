package routing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer A = new Computer();
		Computer B = new Computer();
		Computer C = new Computer();
		Computer D = new Computer();
		Computer E = new Computer();
		
		A.computers[0]=A;
		B.computers[0]=A;
		C.computers[0]=A;
		D.computers[0]=A;
		E.computers[0]=A;

		A.computers[1]=B;
		B.computers[1]=B;
		C.computers[1]=B;
		D.computers[1]=B;
		E.computers[1]=B;

		A.computers[2]=C;
		B.computers[2]=C;
		C.computers[2]=C;
		D.computers[2]=C;
		E.computers[2]=C;
		
		A.computers[3]=D;
		B.computers[3]=D;
		C.computers[3]=D;
		D.computers[3]=D;
		E.computers[3]=D;
		
		A.computers[4]=E;
		B.computers[4]=E;
		C.computers[4]=E;
		D.computers[4]=E;
		E.computers[4]=E;

		
		Scanner scan = new Scanner(System.in);
		String message;
		int port;
		String receiver;
		String sender;
		
		System.out.println("Input Message you want to send: ");
		message = scan.nextLine();
		
		System.out.println("Input the port: ");
		port = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Input Sender: ");
		sender = scan.nextLine();
		
		System.out.println("Input Receiver: ");
		receiver = scan.nextLine();
		
		A.send(message, port, B);
		
		if(sender == "A")
		{
			if(receiver == "B")
			{
				A.send(message, port, B);
			}
			else if(receiver == "C")
			{
				A.send(message, port, C);
			}
			else if(receiver == "D")
			{
				A.send(message, port, D);
			}
			else if(receiver =="E")
			{
				A.send(message, port, E);
			}	
		}
		else if(sender == "B")
		{
			if(receiver == "A")
			{
				B.send(message, port, A);
			}
			else if(receiver == "C")
			{
				B.send(message, port, C);
			}
			else if(receiver == "D")
			{
				B.send(message, port, D);
			}
			else if(receiver =="E")
			{
				B.send(message, port, E);
			}	
		}
		else if(sender == "C")
		{
			if(receiver == "A")
			{
				C.send(message, port, A);
			}
			else if(receiver == "B")
			{
				C.send(message, port, B);
			}
			else if(receiver == "D")
			{
				C.send(message, port, D);
			}
			else if(receiver =="E")
			{
				C.send(message, port, E);
			}	
		}
		else if(sender == "D")
		{
			if(receiver == "A")
			{
				D.send(message, port, A);
			}
			else if(receiver == "B")
			{
				D.send(message, port, B);
			}
			else if(receiver == "C")
			{
				D.send(message, port, C);
			}
			else if(receiver =="E")
			{
				D.send(message, port, E);
			}	
		}
		else if(sender == "E")
		{
			if(receiver == "A")
			{
				E.send(message, port, A);
			}
			else if(receiver == "B")
			{
				E.send(message, port, B);
			}
			else if(receiver == "C")
			{
				E.send(message, port, C);
			}
			else if(receiver =="D")
			{
				E.send(message, port, D);
			}	
		}
		
		
		System.out.println("From: " + sender);
		System.out.println("To: " + receiver);
		
	}

}
