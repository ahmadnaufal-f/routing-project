package routing;
import java.util.Scanner;

public class Djikstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//making matrix and initialization
		int[][] matrix = new int[5][5];
		int[] distance = new int[5]; 
		int[] visited = new int[5];
		int[] preD = new int[5];
		int min = Integer.MAX_VALUE;
		int nextNode=0;
		
		for(int i=0;i<5;i++){
			visited[i] = 0;
			preD[i]=0;
			for(int j=0;j<5;j++){
				
				System.out.printf("Enter the cost for matrix [%d][%d]: ",i,j);
				matrix[i][j] = scan.nextInt();
				if(matrix[i][j] == 0){
				matrix[i][j] = 999; //max value
					}
				
				}
			
			
		}
		
		distance = matrix[0];
		distance[0] = 0;
		visited[0]=1;
		
		for(int i=0;i<5;i++){  // loop to read all the nodes
			min = Integer.MAX_VALUE;
		
			for(int j=0;j<5;j++){ //this loop inside the big loop is
						//used to update the distance and the visited node, 
						// only if the nodes is not yet visited and it is appropriate to
				//be visited (the current minimum is greater than the path to the next node)
				
				if(min>=distance[j] && visited[j]!=1){
					min = distance[j];
					nextNode = j;
				}
				
			}
			visited[nextNode] = 1; //to validate that this node is visited
			
			
			for(int x=0;x<5;x++){ //update if the cost added with 
				           //the neighbouring unvisited node is less than the
							//previous neighboring node
				if(visited[x]!=1){
					if(min+matrix[nextNode][x]<distance[x]){
						distance[x] = min+matrix[nextNode][x];
						preD[x] = nextNode;
					}
				}
			}
			
			
		}
		
		//output to print the order of the path
		for(int i=0;i<5;i++){
			System.out.print("|" + distance[i]);
		}
		System.out.print("|");
		
		for(int i=0;i<5;i++){
			int j;
			System.out.print("Path = "+i);
			j=i;
			
			do{
				j = preD[j];
				System.out.print(" <- "+j);
			}while(j!=0);
			System.out.println("");
		}

	}

}
