package routing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int AdjacencyMatrix[][];
		int nodeNum =5;
		int source=0, destination=0; //initialize the source and destination to be 0 first
		
		
           
            AdjacencyMatrix = new int[6][6];
 
            for (int i = 1; i <= nodeNum; i++)
            {
                for (int j = 1; j <=nodeNum; j++)
                {

                   
                    if (i == j)
                    {
     
                    	AdjacencyMatrix[i][j] = 0;
                        System.out.printf("The edge for the matrix for the source of %d to the destination of %d is 0", i, j);
                        System.out.println();
                      
                    }
                    else
                    {
                    	 System.out.printf("Enter the cost of the edge for the matrix for the source of %d to the destination of %d : ", i, j);
                         AdjacencyMatrix[i][j] = sc.nextInt();
                    }
                   
                }
            }
 
            do {
            System.out.println("Enter the source node: ");
            source = sc.nextInt();
            }while(source<1 || source>5);
 
            do {
            System.out.println("Enter the destination node: ");
            destination = sc.nextInt();
            }while(destination<1 || destination>5);
 
            Computation dijkstra = new Computation(nodeNum);
            dijkstra.algorithm(AdjacencyMatrix, source);
 
            
            for (int i = 1; i <= dijkstra.distance.length-1; i++) //subtract by 1 because initially distance[node] is 0
            {
                if (i == destination)
                    System.out.println("The shortest path from" + source + " to " + i + " is "  //to find the destination in the loop to calculate 
                    						//the formula is the current source added by the distance to the destination
                            + dijkstra.distance[i]);
            }
        
        
    }
}
		
