package routing;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int AdjacencyMatrix[][];
		int nodeNum =5;
		char sourceName;
		char destinationName; //initialize the source and destination to be 0 first
		int source =0, destination =0;
		ArrayList<Integer> path = new ArrayList<Integer>();
           
		AdjacencyMatrix = new int[6][6];
		Computation dijkstra = new Computation(nodeNum);
        dijkstra.initializeEdge(AdjacencyMatrix);
          
            
            
 
            do {
            System.out.println("Enter the source node: ");
            sourceName = sc.next().charAt(0);
            }while(sourceName!='A' && sourceName!='B' && sourceName!='C' && sourceName!='D' && sourceName!='E');
 
            do {
            System.out.println("Enter the destination node: ");
            destinationName = sc.next().charAt(0);
            }while(destinationName!='A' && destinationName!='B' && destinationName!='C' && destinationName!='D' && destinationName!='E');
 
           
            
            
            
            if(sourceName =='A')
            {
            	source =1;
            }
            else if(sourceName == 'B')
            {
            	source =2;
            }
            else if(sourceName == 'C')
            {
            	source =3;
            }
            else if(sourceName == 'D')
            {
            	source =4;
            }
            else if(sourceName == 'E')
            {
            	source =5;
            }
            
            
            
            
            
            if(destinationName =='A')
            {
            	destination =1;
            }
            else if(destinationName == 'B')
            {
            	destination =2;
            }
            else if(destinationName == 'C')
            {
            	destination =3;
            }
            else if(destinationName == 'D')
            {
            	destination =4;
            }
            else if(destinationName == 'E')
            {
            	destination =5;
            }
           
 
            dijkstra.algorithm(source, path);
            
            for (int i = 1; i <= dijkstra.distance.length-1; i++) //subtract by 1 because initially distance[node] is 0
            {
                if (i == destination)
                    System.out.println("The shortest path from " + sourceName + " to " + destinationName + " is "  //to find the destination in the loop to calculate 
                    						//the formula is the current source added by the distance to the destination
                            + dijkstra.distance[i]);
                
                
            }
            
            System.out.println();
            System.out.println("The path for this is: ");
            for(int i=0; i<path.size(); i++)
            {
            	
            	if(path.get(i) == 1)
            		System.out.println('A');
            	if(path.get(i) == 2)
            		System.out.println('B');
            	if(path.get(i) == 3)
            		System.out.println('C');
            	if(path.get(i) == 4)
            		System.out.println('D');
            	if(path.get(i)==5)
            		System.out.println('E');
            	if(path.get(i) == destination)
            	{
            		break;
            	}
            }
        
        
    }
}
		
