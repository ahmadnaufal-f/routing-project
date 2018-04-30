package routing;

public class DjikstraUndone {
	public static void routingf(int step, int ab, int ac, int bc, int bd, int cd, int ce, int de) {
		int[][] distance = new int[5][5];
		int[] cost = new int[5];
		int[] prenode = new int[5];
		int m[] = new int[5]; //this variable will store last known node with minimum cost for each step
		String[] table = new String[] { " ", " ", " ", " ", " " };
		String[] naccent = {" "};

		//assign all distance value to max except for the same node
		for(int i = 0; i<5;i++){
			for(int j = 0; j<5;j++){
				distance[i][j] = Integer.MAX_VALUE;
				if(i==j){
					distance[i][j] = 0;
				}
			}
		}
		
		//pass the inputted value to distance matrix
		distance[0][1]=ab;
		distance[0][2]=ac;
		distance[1][2]=bc;
		distance[1][3]=bd;
		distance[2][3]=cd;
		distance[2][4]=ce;
		distance[3][4]=de;
		
		//step 0
		naccent[0] = "A";
		
		//assign costs from node A
		for (int i = 1; i<5; i++){
			cost[i]=distance[0][i];
			prenode[i] = 0;
		}
		table[step] = row(step, cost, prenode, naccent);
		
		//find minimum cost
		m[step] = minimumcostnode(cost);
		
		//step 1
		for (int i = 0; i<5; i++){
			if (i == m[step]){
				cost[i] = 999;
			}
			else{
				prenode[i] = findprenode(cost[i], distance[0][m[step]]+distance[m[step]][i], prenode[i], m[step]);
				cost[i] = comparecost(cost[i], distance[0][m[step]]+distance[m[step]][i]);
			}
		}
		
		
		System.out.println(table[step]);
		
	}
	
	public static String row(int i, int[] costs, int[] prenodes, String[] naccents){
		String rowstring = "";
		rowstring = (i+"\t"+naccents[i]+"\t");
		for(int j=1; j<5; j++){
			if(costs[j]==Integer.MAX_VALUE){
				rowstring = rowstring +"inf\t";
			}
			else{
				rowstring = rowstring + costs[j];
				switch (prenodes[j]){
					case 0: rowstring = rowstring + ",A\t";
							break;
					case 1: rowstring = rowstring + ",B\t";
							break;
					case 2: rowstring = rowstring + ",C\t";
							break;
					case 3: rowstring = rowstring + ",D\t";
							break;
				}
			}
		}
		return rowstring;
	}
	
	public static int minimumcost(int[] a){
		int minvalue = Integer.MAX_VALUE;
		for(int i = 1; i<5; i++){
			if (a[i] < minvalue){
				minvalue = a[i];
			}
		}
		return minvalue;
	}
	
	public static int comparecost(int a, int b){
		if(a<b){
			return a;
		}
		else{ 
			return b;
		}
	}
	
	public static int findprenode(int a, int b, int initialprenode, int mnode){
		if(a>b){
			return mnode;
		}
		else{
			return initialprenode;
		}
	}
	
	public static int minimumcostnode(int[] a){
		int minvalue = Integer.MAX_VALUE;
		int index = 0;
		for(int i = 1; i<4; i++){
			if (a[i] < minvalue){
				index = i;
				minvalue = a[i];
			}
		}
		return index;
	}
	
	public static void main(String[] args){
		routingf(0,2,5,6,7,2,3,1);
	}
	
}
