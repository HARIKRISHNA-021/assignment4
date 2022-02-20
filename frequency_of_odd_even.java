
public class frequency_of_odd_even {

	public frequency_of_odd_even() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]n1=new int[][] {{1,3,5},{2,4,1},{7,8,9}};
int sum=0;
int sum1=0;
for(int i=0;i<n1.length;i++) {
	for(int j=0;j<n1[i].length;j++) {
		if(n1[i][j]%2==0) {
			sum+=1;
			}
	else if(n1[i][j]%2!=0) { 
		sum1+=1;
		}
}
}	
	System.out.println(sum);

   System.out.println(sum1);

}
}

