
public class matrix_print_spiral_order {

	public matrix_print_spiral_order() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]m1=new int[][] {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
		int s=0;
		for(int i=0;i<m1.length;i++) {
			
			for(int j=0;j<m1[i].length;j++) {
				
				if(s<m1[i][j]&&s>m1[i][j]) { 
				s=m1[i][j];
				System.out.print(s+" ");

							}
				
		}
		
	}
		//System.out.print(s+" ");
}
	}