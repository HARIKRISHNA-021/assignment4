import java.util.Scanner;

public class adding_two_matrices {

	public adding_two_matrices() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,2,3},{4,4,1},{3,6,5}};    
		int b[][]={{2,0,4},{4,3,2},{2,3,4}};    
		int c[][]=new int[3][3];   //new matrices to store sum values 
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();    
		}    
		

	}

}
